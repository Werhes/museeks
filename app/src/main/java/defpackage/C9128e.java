package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۦۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9128e implements InterfaceC5204e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public long f18283e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f18284e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f18285e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18286e = 1;

    public /* synthetic */ C9128e() {
    }

    public C9128e(int i, long j, int i2) {
        this.f18284e = i;
        this.f18283e = j;
        this.f18285e = i2;
    }

    public String toString() {
        switch (this.f18286e) {
            case 0:
                StringBuilder sb = new StringBuilder("AtomSizeTooSmall{type=");
                sb.append(AbstractC9413e.m2563return(this.f18284e));
                sb.append(", size=");
                sb.append(this.f18283e);
                sb.append(", minHeaderSize=");
                return AbstractC17861e.smaato(this.f18285e, "}", sb);
            default:
                return super.toString();
        }
    }
}
