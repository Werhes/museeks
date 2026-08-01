package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑۜٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0576e extends AbstractC6329e implements Parcelable, InterfaceC16595e {
    public static final Parcelable.Creator<C0576e> CREATOR = new C6220e(0);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C6570e f2765e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC1589e f2766e;

    public C0576e(Object obj, InterfaceC1589e interfaceC1589e) {
        this.f2766e = interfaceC1589e;
        AbstractC13717e adcel = AbstractC12909e.adcel();
        C6570e c6570e = new C6570e(adcel.billing(), obj);
        if (!(adcel instanceof C17137e)) {
            c6570e.vip = new C6570e(1, obj);
        }
        this.f2765e = c6570e;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f2765e;
    }

    @Override // defpackage.AbstractC6329e, defpackage.InterfaceC17335e
    public final AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        if (this.f2766e.license(((C6570e) abstractC8618e2).metrica, ((C6570e) abstractC8618e3).metrica)) {
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
        return ((C6570e) AbstractC12909e.signatures(this.f2765e, this)).metrica;
    }

    @Override // defpackage.InterfaceC3314e
    public final void setValue(Object obj) {
        AbstractC13717e adcel;
        C6570e c6570e = (C6570e) AbstractC12909e.yandex(this.f2765e);
        if (this.f2766e.license(c6570e.metrica, obj)) {
            return;
        }
        C6570e c6570e2 = this.f2765e;
        synchronized (AbstractC12909e.metrica) {
            adcel = AbstractC12909e.adcel();
            ((C6570e) AbstractC12909e.Signature(c6570e2, this, adcel, c6570e)).metrica = obj;
            Unit unit = Unit.INSTANCE;
        }
        AbstractC12909e.loadAd(adcel, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((C6570e) AbstractC12909e.yandex(this.f2765e)).metrica + ")@" + hashCode();
    }

    @Override // defpackage.InterfaceC16595e
    public final InterfaceC1589e vip() {
        return this.f2766e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        C10990e c10990e = C10990e.f21771e;
        InterfaceC1589e interfaceC1589e = this.f2766e;
        if (AbstractC7890e.billing(interfaceC1589e, c10990e)) {
            i2 = 0;
        } else if (AbstractC7890e.billing(interfaceC1589e, C12575e.f25232e)) {
            i2 = 1;
        } else {
            if (!AbstractC7890e.billing(interfaceC1589e, C10990e.f21769e)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i2 = 2;
        }
        parcel.writeInt(i2);
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f2765e = (C6570e) abstractC8618e;
    }
}
