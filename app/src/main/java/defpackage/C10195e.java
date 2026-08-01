package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10195e {
    public final boolean ad;
    public final boolean adcel;
    public final boolean appmetrica;
    public final boolean billing;
    public final boolean license;
    public final boolean metrica;
    public final int mopub;
    public final String purchase;
    public final boolean startapp;
    public final boolean vip;
    public final String yandex;

    public C10195e(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, boolean z6, String str2, boolean z7, boolean z8, int i) {
        this.ad = z;
        this.vip = z2;
        this.metrica = z3;
        this.license = z4;
        this.appmetrica = z5;
        this.purchase = str;
        this.billing = z6;
        this.yandex = str2;
        this.startapp = z7;
        this.adcel = z8;
        this.mopub = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.ad);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.vip);
        sb.append(", isLenient=");
        sb.append(this.metrica);
        sb.append(", allowStructuredMapKeys=");
        sb.append(this.license);
        sb.append(", prettyPrint=false, explicitNulls=");
        sb.append(this.appmetrica);
        sb.append(", prettyPrintIndent='");
        sb.append(this.purchase);
        sb.append("', coerceInputValues=");
        sb.append(this.billing);
        sb.append(", useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.yandex);
        sb.append("', allowSpecialFloatingPointValues=");
        sb.append(this.startapp);
        sb.append(", useAlternativeNames=");
        sb.append(this.adcel);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int i = this.mopub;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "POLYMORPHIC" : "ALL_JSON_OBJECTS" : "NONE");
        sb.append(')');
        return sb.toString();
    }
}
