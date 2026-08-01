package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۧۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15867e extends AbstractC6329e implements Parcelable, InterfaceC16595e, InterfaceC16132e, InterfaceC3314e {
    public static final Parcelable.Creator<C15867e> CREATOR = new C1304e(3);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public C13739e f31298e;

    public C15867e(long j) {
        AbstractC13717e adcel = AbstractC12909e.adcel();
        C13739e c13739e = new C13739e(adcel.billing(), j);
        if (!(adcel instanceof C17137e)) {
            c13739e.vip = new C13739e(1, j);
        }
        this.f31298e = c13739e;
    }

    @Override // defpackage.InterfaceC17335e
    public final AbstractC8618e appmetrica() {
        return this.f31298e;
    }

    @Override // defpackage.AbstractC6329e, defpackage.InterfaceC17335e
    public final AbstractC8618e billing(AbstractC8618e abstractC8618e, AbstractC8618e abstractC8618e2, AbstractC8618e abstractC8618e3) {
        if (((C13739e) abstractC8618e2).metrica == ((C13739e) abstractC8618e3).metrica) {
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
        return Long.valueOf(purchase());
    }

    public final long purchase() {
        return ((C13739e) AbstractC12909e.signatures(this.f31298e, this)).metrica;
    }

    @Override // defpackage.InterfaceC3314e
    public final void setValue(Object obj) {
        startapp(((Number) obj).longValue());
    }

    public final void startapp(long j) {
        AbstractC13717e adcel;
        C13739e c13739e = (C13739e) AbstractC12909e.yandex(this.f31298e);
        if (c13739e.metrica != j) {
            C13739e c13739e2 = this.f31298e;
            synchronized (AbstractC12909e.metrica) {
                adcel = AbstractC12909e.adcel();
                ((C13739e) AbstractC12909e.Signature(c13739e2, this, adcel, c13739e)).metrica = j;
                Unit unit = Unit.INSTANCE;
            }
            AbstractC12909e.loadAd(adcel, this);
        }
    }

    public final String toString() {
        return "MutableLongState(value=" + ((C13739e) AbstractC12909e.yandex(this.f31298e)).metrica + ")@" + hashCode();
    }

    @Override // defpackage.InterfaceC16595e
    public final InterfaceC1589e vip() {
        return C12575e.f25232e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(purchase());
    }

    @Override // defpackage.InterfaceC17335e
    public final void yandex(AbstractC8618e abstractC8618e) {
        this.f31298e = (C13739e) abstractC8618e;
    }
}
