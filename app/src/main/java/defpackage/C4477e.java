package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؖۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4477e extends AbstractC12614e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C4477e f9679e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final Object[] f9680e;

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient int f9681e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final transient int f9682e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object[] f9683e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final transient int f9684e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient Object[] f9685e;

    static {
        Object[] objArr = new Object[0];
        f9680e = objArr;
        f9679e = new C4477e(0, 0, 0, objArr, objArr);
    }

    public C4477e(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.f9683e = objArr;
        this.f9681e = i;
        this.f9685e = objArr2;
        this.f9684e = i2;
        this.f9682e = i3;
    }

    @Override // defpackage.AbstractC0281e
    public final int adcel() {
        return 0;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return false;
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        Object[] objArr2 = this.f9683e;
        int i2 = this.f9682e;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f9685e;
            if (objArr.length != 0) {
                int appmetrica = AbstractC3192e.appmetrica(obj);
                while (true) {
                    int i = appmetrica & this.f9684e;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    appmetrica = i + 1;
                }
            }
        }
        return false;
    }

    @Override // defpackage.AbstractC12614e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9681e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f9682e;
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return appmetrica().listIterator(0);
    }

    @Override // defpackage.AbstractC0281e
    public final int startapp() {
        return this.f9682e;
    }

    @Override // defpackage.AbstractC12614e
    public final AbstractC17475e subscription() {
        return AbstractC17475e.loadAd(this.f9682e, this.f9683e);
    }

    @Override // defpackage.AbstractC0281e
    public final Object[] yandex() {
        return this.f9683e;
    }
}
