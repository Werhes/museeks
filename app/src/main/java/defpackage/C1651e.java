package defpackage;

import android.database.Cursor;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1651e {
    public final String ad;
    public final Set license;
    public final Set metrica;
    public final Map vip;

    public C1651e(String str, HashMap hashMap, HashSet hashSet, HashSet hashSet2) {
        this.ad = str;
        this.vip = DesugarCollections.unmodifiableMap(hashMap);
        this.metrica = DesugarCollections.unmodifiableSet(hashSet);
        this.license = hashSet2 == null ? null : DesugarCollections.unmodifiableSet(hashSet2);
    }

    public static C1651e ad(C4734e c4734e, String str) {
        int i;
        int i2;
        int i3;
        ArrayList arrayList;
        Cursor ads = c4734e.ads(AbstractC5087e.m1746extends("PRAGMA table_info(`", str, "`)"));
        HashMap hashMap = new HashMap();
        try {
            if (ads.getColumnCount() > 0) {
                int columnIndex = ads.getColumnIndex("name");
                int columnIndex2 = ads.getColumnIndex("type");
                int columnIndex3 = ads.getColumnIndex("notnull");
                int columnIndex4 = ads.getColumnIndex("pk");
                int columnIndex5 = ads.getColumnIndex("dflt_value");
                while (ads.moveToNext()) {
                    String string = ads.getString(columnIndex);
                    hashMap.put(string, new C3824e(ads.getInt(columnIndex4), 2, string, ads.getString(columnIndex2), ads.getString(columnIndex5), ads.getInt(columnIndex3) != 0));
                }
            }
            ads.close();
            HashSet hashSet = new HashSet();
            ads = c4734e.ads("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = ads.getColumnIndex("id");
                int columnIndex7 = ads.getColumnIndex("seq");
                int columnIndex8 = ads.getColumnIndex("table");
                int columnIndex9 = ads.getColumnIndex("on_delete");
                int columnIndex10 = ads.getColumnIndex("on_update");
                ArrayList vip = vip(ads);
                int count = ads.getCount();
                int i4 = 0;
                while (i4 < count) {
                    ads.moveToPosition(i4);
                    if (ads.getInt(columnIndex7) != 0) {
                        i = i4;
                        i2 = columnIndex6;
                        i3 = columnIndex7;
                        arrayList = vip;
                    } else {
                        int i5 = ads.getInt(columnIndex6);
                        i = i4;
                        ArrayList arrayList2 = new ArrayList();
                        i2 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = vip.iterator();
                        while (it.hasNext()) {
                            int i6 = columnIndex7;
                            C18258e c18258e = (C18258e) it.next();
                            ArrayList arrayList4 = vip;
                            if (c18258e.f35713e == i5) {
                                arrayList2.add(c18258e.f35710e);
                                arrayList3.add(c18258e.f35712e);
                            }
                            columnIndex7 = i6;
                            vip = arrayList4;
                        }
                        i3 = columnIndex7;
                        arrayList = vip;
                        hashSet.add(new C4898e(ads.getString(columnIndex8), ads.getString(columnIndex9), ads.getString(columnIndex10), arrayList2, arrayList3));
                    }
                    i4 = i + 1;
                    columnIndex6 = i2;
                    columnIndex7 = i3;
                    vip = arrayList;
                }
                ads.close();
                ads = c4734e.ads("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = ads.getColumnIndex("name");
                    int columnIndex12 = ads.getColumnIndex("origin");
                    int columnIndex13 = ads.getColumnIndex("unique");
                    HashSet hashSet2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        HashSet hashSet3 = new HashSet();
                        while (ads.moveToNext()) {
                            if ("c".equals(ads.getString(columnIndex12))) {
                                C10475e metrica = metrica(c4734e, ads.getString(columnIndex11), ads.getInt(columnIndex13) == 1);
                                if (metrica != null) {
                                    hashSet3.add(metrica);
                                }
                            }
                        }
                        ads.close();
                        hashSet2 = hashSet3;
                        return new C1651e(str, hashMap, hashSet, hashSet2);
                    }
                    return new C1651e(str, hashMap, hashSet, hashSet2);
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    public static C10475e metrica(C4734e c4734e, String str, boolean z) {
        Cursor ads = c4734e.ads(AbstractC5087e.m1746extends("PRAGMA index_xinfo(`", str, "`)"));
        try {
            int columnIndex = ads.getColumnIndex("seqno");
            int columnIndex2 = ads.getColumnIndex("cid");
            int columnIndex3 = ads.getColumnIndex("name");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1) {
                TreeMap treeMap = new TreeMap();
                while (ads.moveToNext()) {
                    if (ads.getInt(columnIndex2) >= 0) {
                        int i = ads.getInt(columnIndex);
                        treeMap.put(Integer.valueOf(i), ads.getString(columnIndex3));
                    }
                }
                ArrayList arrayList = new ArrayList(treeMap.size());
                arrayList.addAll(treeMap.values());
                C10475e c10475e = new C10475e(str, arrayList, z);
                ads.close();
                return c10475e;
            }
            ads.close();
            return null;
        } catch (Throwable th) {
            ads.close();
            throw th;
        }
    }

    public static ArrayList vip(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("id");
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        int count = cursor.getCount();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < count; i++) {
            cursor.moveToPosition(i);
            arrayList.add(new C18258e(cursor.getInt(columnIndex), cursor.getInt(columnIndex2), cursor.getString(columnIndex3), cursor.getString(columnIndex4)));
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public final boolean equals(Object obj) {
        Set set;
        if (this == obj) {
            return true;
        }
        if (obj == null || C1651e.class != obj.getClass()) {
            return false;
        }
        C1651e c1651e = (C1651e) obj;
        Set set2 = c1651e.metrica;
        Map map = c1651e.vip;
        String str = c1651e.ad;
        String str2 = this.ad;
        if (str2 == null ? str != null : !str2.equals(str)) {
            return false;
        }
        Map map2 = this.vip;
        if (map2 == null ? map != null : !map2.equals(map)) {
            return false;
        }
        Set set3 = this.metrica;
        if (set3 == null ? set2 != null : !set3.equals(set2)) {
            return false;
        }
        Set set4 = this.license;
        if (set4 == null || (set = c1651e.license) == null) {
            return true;
        }
        return set4.equals(set);
    }

    public final int hashCode() {
        String str = this.ad;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Map map = this.vip;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 31;
        Set set = this.metrica;
        return hashCode2 + (set != null ? set.hashCode() : 0);
    }

    public final String toString() {
        return "TableInfo{name='" + this.ad + "', columns=" + this.vip + ", foreignKeys=" + this.metrica + ", indices=" + this.license + '}';
    }
}
