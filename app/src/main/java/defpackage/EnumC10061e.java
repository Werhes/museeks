package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC10061e {
    NONE("NONE"),
    /* JADX INFO: Fake field, exist only in values array */
    AES("AES-128"),
    /* JADX INFO: Fake field, exist only in values array */
    SAMPLE_AES("SAMPLE-AES");


    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final HashMap f19873e = new HashMap();

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f19876e;

    static {
        for (EnumC10061e enumC10061e : values()) {
            f19873e.put(enumC10061e.f19876e, enumC10061e);
        }
    }

    EnumC10061e(String str) {
        this.f19876e = str;
    }
}
