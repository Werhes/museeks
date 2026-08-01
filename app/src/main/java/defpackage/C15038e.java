package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۢٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15038e extends AbstractC8618e {
    public float adcel;
    public InterfaceC2141e advert;
    public C12476e amazon;
    public C12347e appmetrica;
    public boolean billing;
    public List license;
    public CharSequence metrica;
    public EnumC7792e mopub;
    public C1839e purchase;
    public long smaato;
    public float startapp;
    public boolean yandex;

    public C15038e() {
        super(AbstractC12909e.adcel().billing());
        this.startapp = Float.NaN;
        this.adcel = Float.NaN;
        this.smaato = AbstractC2278e.vip(0, 0, 0, 0, 15);
    }

    @Override // defpackage.AbstractC8618e
    public final void ad(AbstractC8618e abstractC8618e) {
        C15038e c15038e = (C15038e) abstractC8618e;
        this.metrica = c15038e.metrica;
        this.license = c15038e.license;
        this.appmetrica = c15038e.appmetrica;
        this.purchase = c15038e.purchase;
        this.billing = c15038e.billing;
        this.yandex = c15038e.yandex;
        this.startapp = c15038e.startapp;
        this.adcel = c15038e.adcel;
        this.mopub = c15038e.mopub;
        this.advert = c15038e.advert;
        this.smaato = c15038e.smaato;
        this.amazon = c15038e.amazon;
    }

    public final String toString() {
        return "CacheRecord(visualText=" + ((Object) this.metrica) + ", annotations=" + this.license + ", composition=" + this.appmetrica + ", textStyle=" + this.purchase + ", singleLine=" + this.billing + ", softWrap=" + this.yandex + ", densityValue=" + this.startapp + ", fontScale=" + this.adcel + ", layoutDirection=" + this.mopub + ", fontFamilyResolver=" + this.advert + ", constraints=" + ((Object) C5602e.advert(this.smaato)) + ", layoutResult=" + this.amazon + ')';
    }

    @Override // defpackage.AbstractC8618e
    public final AbstractC8618e vip() {
        return new C15038e();
    }
}
