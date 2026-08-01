package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7009e extends AbstractC11321e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final int f14345e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final byte[] f14346e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final int f14347e;

    public C7009e(byte[] bArr, int i, int i2) {
        AbstractC7244e.subscription(i, i + i2, bArr.length);
        this.f14346e = bArr;
        this.f14347e = i;
        this.f14345e = i2;
    }

    @Override // defpackage.AbstractC7244e
    public final void adcel(AbstractC13874e abstractC13874e) {
        abstractC13874e.admob(this.f14347e, this.f14345e, this.f14346e);
    }

    @Override // defpackage.AbstractC7244e
    public final boolean advert(AbstractC7244e abstractC7244e) {
        boolean z = abstractC7244e instanceof C10553e;
        if (!z && !(abstractC7244e instanceof C7009e)) {
            return abstractC7244e.advert(this);
        }
        int billing = abstractC7244e.billing();
        int i = this.f14345e;
        if (i > billing) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 18 + String.valueOf(i).length());
            sb.append("Length too large: ");
            sb.append(i);
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i > abstractC7244e.billing()) {
            int billing2 = abstractC7244e.billing();
            StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 27 + String.valueOf(billing2).length());
            sb2.append("Ran off end of other: 0, ");
            sb2.append(i);
            sb2.append(", ");
            sb2.append(billing2);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.f14346e;
        int i2 = this.f14347e;
        if (z) {
            return AbstractC7244e.remoteconfig(bArr, i2, 0, ((C10553e) abstractC7244e).f20832e, i);
        }
        if (!(abstractC7244e instanceof C7009e)) {
            return abstractC7244e.yandex(0, i).equals(yandex(i2, i + i2));
        }
        C7009e c7009e = (C7009e) abstractC7244e;
        return AbstractC7244e.remoteconfig(bArr, i2, c7009e.f14347e, c7009e.f14346e, i);
    }

    @Override // defpackage.AbstractC7244e
    public final byte appmetrica(int i) {
        return this.f14346e[this.f14347e + i];
    }

    @Override // defpackage.AbstractC7244e
    public final int billing() {
        return this.f14345e;
    }

    @Override // defpackage.AbstractC7244e
    public final int smaato(int i, int i2) {
        return AbstractC17904e.ad(i, this.f14347e, i2, this.f14346e);
    }

    @Override // defpackage.AbstractC7244e
    public final void startapp(int i, byte[] bArr) {
        System.arraycopy(this.f14346e, this.f14347e, bArr, 0, i);
    }

    @Override // defpackage.AbstractC7244e
    public final AbstractC11321e yandex(int i, int i2) {
        int subscription = AbstractC7244e.subscription(i, i2, this.f14345e);
        if (subscription == 0) {
            return AbstractC7244e.f14800e;
        }
        return new C7009e(this.f14346e, this.f14347e + i, subscription);
    }
}
