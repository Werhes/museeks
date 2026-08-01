package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7198e {
    public int ad = 0;
    public boolean license;
    public boolean metrica;
    public boolean vip;

    public C12251e ad() {
        if (this.vip || !(this.metrica || this.license)) {
            return new C12251e(this);
        }
        throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
    }
}
