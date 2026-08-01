package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10836e {
    public final boolean ad;
    public final boolean appmetrica;
    public final boolean billing;
    public final boolean license;
    public final boolean metrica;
    public final boolean purchase;
    public final boolean startapp;
    public final boolean vip;
    public final boolean yandex;

    public C10836e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.ad = z;
        this.vip = z2;
        this.metrica = z3;
        this.license = z4;
        this.appmetrica = z5;
        this.purchase = z6;
        this.billing = z7;
        this.yandex = z8;
        this.startapp = z9;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CborConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        sb.append(this.ad);
        sb.append(", encodeKeyTags=");
        sb.append(this.vip);
        sb.append(", encodeValueTags=");
        sb.append(this.metrica);
        sb.append(", encodeObjectTags=");
        sb.append(this.license);
        sb.append(", verifyKeyTags=");
        sb.append(this.appmetrica);
        sb.append(", verifyValueTags=");
        sb.append(this.purchase);
        sb.append(", verifyObjectTags=");
        sb.append(this.billing);
        sb.append(", useDefiniteLengthEncoding=");
        sb.append(this.yandex);
        sb.append(", preferCborLabelsOverNames=");
        return AbstractC8703e.signatures(sb, this.startapp, ", alwaysUseByteString=false)");
    }
}
