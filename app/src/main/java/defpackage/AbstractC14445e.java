package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؑٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14445e {
    public static final HashMap ad;

    static {
        HashMap hashMap = new HashMap(13);
        ad = hashMap;
        hashMap.put("normal", 400);
        hashMap.put("bold", 700);
        AbstractC13501e.smaato(1, hashMap, "bolder", -1, "lighter");
        AbstractC13501e.smaato(100, hashMap, "100", 200, "200");
        hashMap.put("300", 300);
        hashMap.put("400", 400);
        AbstractC13501e.smaato(500, hashMap, "500", 600, "600");
        AbstractC13501e.admob(hashMap, "700", 700, 800, "800");
        hashMap.put("900", 900);
    }
}
