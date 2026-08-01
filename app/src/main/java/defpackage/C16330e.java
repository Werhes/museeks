package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٛ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16330e extends AbstractC6329e implements Parcelable, InterfaceC16595e, InterfaceC16132e, InterfaceC3314e {
    public static final Parcelable.Creator<C16330e> CREATOR = new C1304e(2);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C6548e f32079e;

    public C16330e(int i) {
        AbstractC13717e adcel = AbstractC12909e.adcel();
        C6548e c6548e = new C6548e(adcel.billing(), i);
        if (!(adcel instanceof C17137e)) {
            c6548e.vip = new C6548e(1, i);
        }
        this.f32079e = c6548e;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f32079e;
    }

    @Override // defpackage.AbstractC6329e, defpackage.InterfaceC17335e
    public final AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        if (((C6548e) abstractC8618e2).metrica == ((C6548e) abstractC8618e3).metrica) {
            return abstractC8618e2;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.InterfaceC16132e
    public final Object getValue() {
        return Integer.valueOf(purchase());
    }

    public final int purchase() {
        return ((C6548e) AbstractC12909e.signatures(this.f32079e, this)).metrica;
    }

    @Override // defpackage.InterfaceC3314e
    public final void setValue(Object obj) {
        startapp(((Number) obj).intValue());
    }

    public final void startapp(int i) {
        AbstractC13717e adcel;
        C6548e c6548e = (C6548e) AbstractC12909e.yandex(this.f32079e);
        if (c6548e.metrica != i) {
            C6548e c6548e2 = this.f32079e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ((C6548e) AbstractC12909e.Signature(c6548e2, this, adcel, c6548e)).metrica = i;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC12909e.loadAd(adcel, this);
        }
    }

    public final String toString() {
        return "MutableIntState(value=" + ((C6548e) AbstractC12909e.yandex(this.f32079e)).metrica + ")@" + hashCode();
    }

    @Override // defpackage.InterfaceC16595e
    public final InterfaceC1589e vip() {
        return C12575e.f25232e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(purchase());
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f32079e = (C6548e) abstractC8618e;
    }
}
