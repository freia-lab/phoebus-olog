/*
 * Copyright (C) 2020 European Spallation Source ERIC.
 *
 *  This program is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU General Public License
 *  as published by the Free Software Foundation; either version 2
 *  of the License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.phoebus.olog.entity.preprocess.impl;

import org.phoebus.olog.entity.Log;
import org.phoebus.olog.entity.preprocess.MarkupCleaner;

/**
 * Default implementation of {@link MarkupCleaner}.
 */
public class DefaultMarkupCleaner implements MarkupCleaner {

    /**
     * Processes the log entry under the assumption that the source field of a {@link Log} object
     * as posted by client can be overwritten, if specified. This
     * method copies the description field to the source field.
     * @param log The {@link Log} entry to clean of markup.
     * @return The processed log entry.
     */
    @Override
    public Log process(Log log){
        log.setSource(log.getDescription());
        return log;
    }

    @Override
    public String getName(){
        return "none";
    }
}
