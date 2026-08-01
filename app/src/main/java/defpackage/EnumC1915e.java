package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٚٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC1915e {
    f5106e("NONE", "not compressed", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF25("raw ", "PCM 8-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF38("twos", "PCM 16-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF51("sowt", "not compressed", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF64("fl32", "PCM 32-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF77("fl64", "PCM 64-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF90("in24", "PCM 24-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF103("in32", "PCM 32-bit", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF117("alaw", "Alaw 2:1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF131("ulaw", "µlaw 2:1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF145("MAC3", "MACE 3-to-1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF160("MAC6", "MACE 6-to-1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF175("ALAW", "CCITT G.711 A-law", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF190("ULAW", "CCITT G.711 u-law", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF205("FL32", "Float 32", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF220("rt24", "RT24 50:1", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF235("rt29", "RT29 50:1", false);


    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final HashMap f5105e = new HashMap();

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean f5108e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f5109e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final String f5110e;

    static {
        for (EnumC1915e enumC1915e : values()) {
            f5105e.put(enumC1915e.f5110e, enumC1915e);
        }
    }

    EnumC1915e(String str, String str2, boolean z) {
        this.f5110e = str;
        this.f5109e = str2;
        this.f5108e = z;
    }
}
