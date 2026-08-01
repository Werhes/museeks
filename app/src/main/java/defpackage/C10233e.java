package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَْٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10233e {
    public final /* synthetic */ int ad;
    public boolean license;
    public boolean metrica;
    public boolean vip;

    public /* synthetic */ C10233e(int i, boolean z, boolean z2, boolean z3) {
        this.ad = i;
        this.vip = z;
        this.metrica = z2;
        this.license = z3;
    }

    public C13395e ad() {
        if (this.vip || !(this.metrica || this.license)) {
            return new C13395e(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
    }

    public String toString() {
        switch (this.ad) {
            case 3:
                return "IsInfoTagFirst:" + this.vip + ":isContiguous:" + this.metrica + ":isAtEnd:" + this.license;
            default:
                return super.toString();
        }
    }
}
