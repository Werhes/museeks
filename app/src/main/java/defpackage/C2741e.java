package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2741e implements InterfaceC1481e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C3168e f6639e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Bundle f6640e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1219e f6641e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC0003e f6642e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Application f6643e;

    public C2741e(Application application, InterfaceC10998e interfaceC10998e, Bundle bundle) {
        C1219e c1219e;
        this.f6639e = interfaceC10998e.yandex();
        this.f6642e = interfaceC10998e.vip();
        this.f6640e = bundle;
        this.f6643e = application;
        if (application != null) {
            if (C1219e.f3859e == null) {
                C1219e.f3859e = new C1219e(application);
            }
            c1219e = C1219e.f3859e;
        } else {
            c1219e = new C1219e(null);
        }
        this.f6641e = c1219e;
    }

    public final AbstractC13960e ad(Class cls, String str) {
        AutoCloseable autoCloseable;
        Application application;
        AbstractC0003e abstractC0003e = this.f6642e;
        if (abstractC0003e == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean isAssignableFrom = AbstractC5054e.class.isAssignableFrom(cls);
        Constructor ad = (!isAssignableFrom || this.f6643e == null) ? AbstractC12354e.ad(cls, AbstractC12354e.vip) : AbstractC12354e.ad(cls, AbstractC12354e.ad);
        if (ad == null) {
            if (this.f6643e != null) {
                return this.f6641e.license(cls);
            }
            if (C6607e.f13625e == null) {
                C6607e.f13625e = new C6607e(12);
            }
            C6607e.f13625e.getClass();
            return AbstractC4465e.purchase(cls);
        }
        C3168e c3168e = this.f6639e;
        C0333e startapp = AbstractC12220e.startapp(c3168e.isPro(str), this.f6640e);
        C17339e c17339e = new C17339e(str, startapp);
        c17339e.ad(c3168e, abstractC0003e);
        EnumC7785e enumC7785e = ((C4891e) abstractC0003e).license;
        int i = 1;
        if (enumC7785e == EnumC7785e.f15778e || enumC7785e.ad(EnumC7785e.f15779e)) {
            c3168e.m1263e();
        } else {
            abstractC0003e.ad(new C5462e(abstractC0003e, c3168e, i));
        }
        AbstractC13960e vip = (!isAssignableFrom || (application = this.f6643e) == null) ? AbstractC12354e.vip(cls, ad, startapp) : AbstractC12354e.vip(cls, ad, application, startapp);
        C15423e c15423e = vip.ad;
        if (c15423e == null) {
            return vip;
        }
        if (c15423e.license) {
            C15423e.ad(c17339e);
            return vip;
        }
        synchronized (c15423e.ad) {
            autoCloseable = (AutoCloseable) c15423e.vip.put("androidx.lifecycle.savedstate.vm.tag", c17339e);
        }
        C15423e.ad(autoCloseable);
        return vip;
    }

    @Override // defpackage.InterfaceC1481e
    public final AbstractC13960e advert(InterfaceC7227e interfaceC7227e, C8229e c8229e) {
        return billing(((InterfaceC18155e) interfaceC7227e).subs(), c8229e);
    }

    @Override // defpackage.InterfaceC1481e
    public final AbstractC13960e billing(Class cls, C8229e c8229e) {
        C11672e c11672e = AbstractC2774e.f6687e;
        LinkedHashMap linkedHashMap = c8229e.ad;
        String str = (String) linkedHashMap.get(c11672e);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (linkedHashMap.get(AbstractC18129e.ad) == null || linkedHashMap.get(AbstractC18129e.vip) == null) {
            if (this.f6642e != null) {
                return ad(cls, str);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) linkedHashMap.get(C1219e.f3858e);
        boolean isAssignableFrom = AbstractC5054e.class.isAssignableFrom(cls);
        Constructor ad = (!isAssignableFrom || application == null) ? AbstractC12354e.ad(cls, AbstractC12354e.vip) : AbstractC12354e.ad(cls, AbstractC12354e.ad);
        return ad == null ? this.f6641e.billing(cls, c8229e) : (!isAssignableFrom || application == null) ? AbstractC12354e.vip(cls, ad, AbstractC18129e.vip(c8229e)) : AbstractC12354e.vip(cls, ad, application, AbstractC18129e.vip(c8229e));
    }

    @Override // defpackage.InterfaceC1481e
    public final AbstractC13960e license(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return ad(cls, canonicalName);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
}
