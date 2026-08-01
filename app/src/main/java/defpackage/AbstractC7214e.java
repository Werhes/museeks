package defpackage;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7214e {
    public static final C2443e ad = new C2443e("UNDEFINED", 2);
    public static final C2443e vip = new C2443e("REUSABLE_CLAIMED", 2);

    public static C1362e ad(int i, int i2, int i3, int i4) {
        Bitmap createBitmap;
        if ((i4 & 4) != 0) {
            i3 = 0;
        }
        C14093e c14093e = C4717e.appmetrica;
        Bitmap.Config m3268switch = AbstractC11815e.m3268switch(i3);
        if (Build.VERSION.SDK_INT >= 26) {
            createBitmap = AbstractC11815e.adcel(i, i2, i3, c14093e);
        } else {
            createBitmap = Bitmap.createBitmap((DisplayMetrics) null, i, i2, m3268switch);
            createBitmap.setHasAlpha(true);
        }
        return new C1362e(createBitmap);
    }

    public static final void advert(InterfaceC5083e interfaceC5083e, Object obj) {
        if (!(interfaceC5083e instanceof C3843e)) {
            interfaceC5083e.billing(obj);
            return;
        }
        C3843e c3843e = (C3843e) interfaceC5083e;
        AbstractC3743e abstractC3743e = c3843e.f8481e;
        AbstractC10731e abstractC10731e = c3843e.f8480e;
        Throwable ad2 = C13523e.ad(obj);
        Object c1427e = ad2 == null ? obj : new C1427e(ad2, false);
        if (amazon(abstractC3743e, abstractC10731e.admob())) {
            c3843e.f8483e = c1427e;
            c3843e.f6325e = 1;
            smaato(abstractC3743e, abstractC10731e.admob(), c3843e);
            return;
        }
        AbstractC11092e ad3 = AbstractC3858e.ad();
        if (ad3.f21991e >= 4294967296L) {
            c3843e.f8483e = c1427e;
            c3843e.f6325e = 1;
            ad3.m2988e(c3843e);
            return;
        }
        ad3.m2986e(true);
        try {
            InterfaceC10500e interfaceC10500e = (InterfaceC10500e) abstractC10731e.admob().mo397public(C4524e.f9798e);
            if (interfaceC10500e == null || interfaceC10500e.purchase()) {
                Object obj2 = c3843e.f8482e;
                InterfaceC8850e admob = abstractC10731e.admob();
                Object purchase = AbstractC2745e.purchase(admob, obj2);
                C13514e subscription = purchase != AbstractC2745e.vip ? AbstractC6494e.subscription(abstractC10731e, admob, purchase) : null;
                try {
                    abstractC10731e.billing(obj);
                    Unit unit = Unit.INSTANCE;
                } finally {
                    if (subscription == null || subscription.m3614e()) {
                        AbstractC2745e.appmetrica(admob, purchase);
                    }
                }
            } else {
                c3843e.billing(new C12763e(interfaceC10500e.mo695implements()));
            }
            do {
            } while (ad3.m2985e());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final boolean amazon(AbstractC3743e abstractC3743e, InterfaceC8850e interfaceC8850e) {
        try {
            return abstractC3743e.mo1397extends(interfaceC8850e);
        } catch (Throwable th) {
            throw new C15295e(th, abstractC3743e, interfaceC8850e);
        }
    }

    public static final int billing(EnumC10237e enumC10237e) {
        int i = enumC10237e == null ? -1 : AbstractC12419e.ad[enumC10237e.ordinal()];
        if (i != 1) {
            int i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                    }
                }
            }
            return i2;
        }
        return 1;
    }

    public static final C8268e license(EnumC6217e enumC6217e) {
        switch (enumC6217e == null ? -1 : AbstractC12419e.vip[enumC6217e.ordinal()]) {
            case 1:
                return AbstractC6050e.license;
            case 2:
                return AbstractC6050e.ad;
            case 3:
                return AbstractC6050e.vip;
            case 4:
                return AbstractC6050e.metrica;
            case 5:
                return AbstractC6050e.appmetrica;
            case 6:
                return AbstractC6050e.purchase;
            default:
                return AbstractC6050e.ad;
        }
    }

    public static final void smaato(AbstractC3743e abstractC3743e, InterfaceC8850e interfaceC8850e, Runnable runnable) {
        try {
            abstractC3743e.advert(interfaceC8850e, runnable);
        } catch (Throwable th) {
            throw new C15295e(th, abstractC3743e, interfaceC8850e);
        }
    }

    public abstract void adcel(View view, int i, int i2);

    public int appmetrica(View view) {
        return 0;
    }

    public abstract boolean loadAd(View view, int i);

    public abstract int metrica(View view, int i);

    public abstract void mopub(View view, float f, float f2);

    public int purchase() {
        return 0;
    }

    public abstract void startapp(int i);

    public abstract int vip(View view, int i);

    public void yandex(View view, int i) {
    }
}
