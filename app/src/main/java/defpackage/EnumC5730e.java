package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC5730e {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);


    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final LinkedHashMap f12126e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f12132e;

    static {
        EnumC5730e[] values = values();
        int appmetrica = AbstractC10064e.appmetrica(values.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(appmetrica < 16 ? 16 : appmetrica);
        for (EnumC5730e enumC5730e : values) {
            linkedHashMap.put(Integer.valueOf(enumC5730e.f12132e), enumC5730e);
        }
        f12126e = linkedHashMap;
    }

    EnumC5730e(int i) {
        this.f12132e = i;
    }
}
