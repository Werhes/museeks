package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2616e extends AbstractC6329e implements Parcelable, InterfaceC16595e, InterfaceC16132e, InterfaceC3314e {
    public static final Parcelable.Creator<C2616e> CREATOR = new C1304e(1);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C9779e f6477e;

    public C2616e(float f) {
        AbstractC13717e adcel = AbstractC12909e.adcel();
        C9779e c9779e = new C9779e(f, adcel.billing());
        if (!(adcel instanceof C17137e)) {
            c9779e.vip = new C9779e(f, 1);
        }
        this.f6477e = c9779e;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f6477e;
    }

    @Override // defpackage.AbstractC6329e, defpackage.InterfaceC17335e
    public final AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        if (((C9779e) abstractC8618e2).metrica == ((C9779e) abstractC8618e3).metrica) {
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
        return Float.valueOf(purchase());
    }

    public final float purchase() {
        return ((C9779e) AbstractC12909e.signatures(this.f6477e, this)).metrica;
    }

    @Override // defpackage.InterfaceC3314e
    public final void setValue(Object obj) {
        startapp(((Number) obj).floatValue());
    }

    public final void startapp(float f) {
        AbstractC13717e adcel;
        C9779e c9779e = (C9779e) AbstractC12909e.yandex(this.f6477e);
        if (c9779e.metrica == f) {
            return;
        }
        C9779e c9779e2 = this.f6477e;
        synchronized (AbstractC12909e.metrica) {
            adcel = AbstractC12909e.adcel();
            ((C9779e) AbstractC12909e.Signature(c9779e2, this, adcel, c9779e)).metrica = f;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC12909e.loadAd(adcel, this);
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((C9779e) AbstractC12909e.yandex(this.f6477e)).metrica + ")@" + hashCode();
    }

    @Override // defpackage.InterfaceC16595e
    public final InterfaceC1589e vip() {
        return C12575e.f25232e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(purchase());
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f6477e = (C9779e) abstractC8618e;
    }
}
