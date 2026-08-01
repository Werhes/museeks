package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۖۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17942e extends AbstractC12699e {
    public final String ad;
    public final EnumC3021e vip;

    public C17942e(String str, EnumC3021e enumC3021e) {
        this.ad = str;
        this.vip = enumC3021e;
    }

    @Override // defpackage.AbstractC12699e
    public final boolean ad() {
        return this.vip != EnumC3021e.RAW;
    }

    public final String toString() {
        int ordinal = this.vip.ordinal();
        return AbstractC17861e.subscription("(typeUrl=", this.ad, ", outputPrefixType=", ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }
}
