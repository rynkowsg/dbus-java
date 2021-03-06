/* 
 * Pescetti Pseudo-Duplimate Generator
 * 
 * Copyright (C) 2007 Matthew Johnson
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License Version 2 as published by
 * the Free Software Foundation.  This program is distributed in the hope that
 * it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.  You should have received a
 * copy of the GNU Lesser General Public License along with this program; if not,
 * write to the Free Software Foundation, Inc., 59 Temple Place - Suite 330,
 * Boston, MA  02111-1307, USA.
 *
 * To Contact me, please email src@matthew.ath.cx
 *
 */
package org.freedesktop.dbus;

import java.util.Locale;
import java.util.ResourceBundle;

public class Gettext
{
   private static ResourceBundle myResources = null;
   static {
      try {
         myResources = ResourceBundle.getBundle("dbusjava_localized", Locale.UK);
      }
      catch (java.util.MissingResourceException e) {
         e.printStackTrace();
      }
   }
   public static String _(String s) {
      if(null != myResources)
         return myResources.getString(s);
      return s;
   }
}
