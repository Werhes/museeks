package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC14035e {
    /* JADX INFO: Fake field, exist only in values array */
    EF0("FORMAT_PCM", "WAV PCM"),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("FORMAT_FLOAT", "WAV IEEE_FLOAT"),
    /* JADX INFO: Fake field, exist only in values array */
    EF4("FORMAT_ALAW", "WAV A-LAW"),
    /* JADX INFO: Fake field, exist only in values array */
    EF6("FORMAT_MULAW", "WAV µ-LAW"),
    f27756e("FORMAT_EXTENSIBLE", "EXTENSIBLE"),
    /* JADX INFO: Fake field, exist only in values array */
    EF66("FORMAT_GSM_COMPRESSED", "GSM_COMPRESSED");


    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final HashMap f27757e = new HashMap();

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f27758e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f27759e;

    static {
        for (EnumC14035e enumC14035e : values()) {
            f27757e.put(Integer.valueOf(enumC14035e.f27759e), enumC14035e);
        }
    }

    EnumC14035e(String str, String str2) {
        this.f27759e = r2;
        this.f27758e = str2;
    }
}
