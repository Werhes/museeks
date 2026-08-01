package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؑۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17479e extends AbstractC0268e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C15380e f34242e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public int f34243e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public int f34244e;

    public boolean getAllowsGoneWidget() {
        return this.f34242e.f30318e;
    }

    public int getMargin() {
        return this.f34242e.f30317e;
    }

    public int getType() {
        return this.f34243e;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.f34242e.f30318e = z;
    }

    public void setDpMargin(int i) {
        this.f34242e.f30317e = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f34242e.f30317e = i;
    }

    public void setType(int i) {
        this.f34243e = i;
    }

    @Override // defpackage.AbstractC0268e
    public final void yandex(C11325e c11325e, boolean z) {
        int i = this.f34243e;
        this.f34244e = i;
        if (z) {
            if (i == 5) {
                this.f34244e = 1;
            } else if (i == 6) {
                this.f34244e = 0;
            }
        } else if (i == 5) {
            this.f34244e = 0;
        } else if (i == 6) {
            this.f34244e = 1;
        }
        if (c11325e instanceof C15380e) {
            ((C15380e) c11325e).f30320e = this.f34244e;
        }
    }
}
