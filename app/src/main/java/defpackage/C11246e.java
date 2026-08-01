package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۚٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11246e implements Handler.Callback, InterfaceC1145e, InterfaceC14503e, InterfaceC17077e {

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public static final long f22536e = AbstractC9413e.m2567switch(10000);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C10379e f22537e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public boolean f22538e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final long f22539e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public final C6158e f22540e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final boolean[] f22541e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final Looper f22542e;

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final long f22543e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public final C9964e f22544e;

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public boolean f22545e;

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public float f22546e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final C8757e f22547e;

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public long f22548e;

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public long f22549e;

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public C11573e f22550e;

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public long f22551e;

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public boolean f22552e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC0241e[] f22553e;

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public int f22554e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final C6408e f22555e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final ArrayList f22556e;

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public C6981e f22557e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C17381e f22558e;

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public C11573e f22559e;

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public boolean f22560e;

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public C17615e f22561e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C2399e f22562e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public final C16683e f22563e;

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public final boolean f22564e;

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public C4610e f22565e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C11501e f22566e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final boolean f22567e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final C5350e f22568e;

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public boolean f22569e;

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public C7422e f22570e;

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public C1198e f22571e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C7982e f22572e;

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public int f22573e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC11130e f22574e;

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public int f22575e;

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public boolean f22576e;

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public long f22577e;

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public C5681e f22578e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final C4174e f22579e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C9556e f22580e;

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public boolean f22581e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final C2399e f22582e;

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public boolean f22583e;

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public boolean f22584e;

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public long f22585e;

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public boolean f22586e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C1167e[] f22587e;

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public boolean f22588e;

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public boolean f22589e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final InterfaceC16610e f22590e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC17674e f22591e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final C5635e f22592e;

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public boolean f22593e;

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public int f22594e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, eٌٍٚ] */
    /* JADX WARN: Type inference failed for: r12v2, types: [eؒٛؒ, java.lang.Object] */
    public C11246e(Context context, AbstractC0241e[] abstractC0241eArr, AbstractC0241e[] abstractC0241eArr2, AbstractC11130e abstractC11130e, C10379e c10379e, InterfaceC17674e interfaceC17674e, InterfaceC16610e interfaceC16610e, int i, boolean z, C4174e c4174e, C1198e c1198e, C5635e c5635e, long j, Looper looper, C17381e c17381e, C6408e c6408e, C5350e c5350e, final InterfaceC17077e interfaceC17077e, boolean z2) {
        C4610e c4610e = C4610e.ad;
        this.f22549e = -9223372036854775807L;
        this.f22555e = c6408e;
        this.f22574e = abstractC11130e;
        this.f22537e = c10379e;
        this.f22591e = interfaceC17674e;
        this.f22590e = interfaceC16610e;
        this.f22554e = i;
        this.f22586e = z;
        this.f22571e = c1198e;
        this.f22592e = c5635e;
        this.f22543e = j;
        this.f22589e = false;
        this.f22558e = c17381e;
        this.f22568e = c5350e;
        this.f22565e = c4610e;
        this.f22579e = c4174e;
        this.f22546e = 1.0f;
        this.f22561e = C17615e.vip;
        this.f22564e = z2;
        this.f22577e = -9223372036854775807L;
        this.f22548e = -9223372036854775807L;
        this.f22539e = ((C2734e) interfaceC17674e).loadAd;
        C12182e c12182e = AbstractC6690e.ad;
        C7422e mopub = C7422e.mopub(c10379e);
        this.f22570e = mopub;
        this.f22557e = new C6981e(mopub);
        this.f22553e = new AbstractC0241e[abstractC0241eArr.length];
        this.f22541e = new boolean[abstractC0241eArr.length];
        C11010e c11010e = (C11010e) abstractC11130e;
        c11010e.getClass();
        this.f22587e = new C1167e[abstractC0241eArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < abstractC0241eArr.length; i2++) {
            AbstractC0241e abstractC0241e = abstractC0241eArr[i2];
            abstractC0241e.f1489e = i2;
            abstractC0241e.f1506e = c5350e;
            abstractC0241e.f1505e = c17381e;
            AbstractC0241e[] abstractC0241eArr3 = this.f22553e;
            abstractC0241e.getClass();
            abstractC0241eArr3[i2] = abstractC0241e;
            AbstractC0241e abstractC0241e2 = this.f22553e[i2];
            synchronized (abstractC0241e2.f1504e) {
                abstractC0241e2.f1495e = c11010e;
            }
            AbstractC0241e abstractC0241e3 = abstractC0241eArr2[i2];
            if (abstractC0241e3 != null) {
                abstractC0241e3.f1489e = i2;
                abstractC0241e3.f1506e = c5350e;
                abstractC0241e3.f1505e = c17381e;
                z3 = true;
            }
            C1167e[] c1167eArr = this.f22587e;
            AbstractC0241e abstractC0241e4 = abstractC0241eArr[i2];
            ?? obj = new Object();
            obj.appmetrica = abstractC0241e4;
            obj.metrica = i2;
            obj.purchase = abstractC0241e3;
            obj.license = 0;
            obj.ad = false;
            obj.vip = false;
            c1167eArr[i2] = obj;
        }
        this.f22567e = z3;
        this.f22544e = new C9964e(this, c17381e);
        this.f22556e = new ArrayList();
        this.f22566e = new C11501e();
        this.f22540e = new C6158e();
        AbstractC2301e.subscription(((C11246e) abstractC11130e.f22047e) == null);
        abstractC11130e.f22047e = this;
        abstractC11130e.f22046e = interfaceC16610e;
        this.f22583e = true;
        C2399e ad = c17381e.ad(looper, null);
        this.f22582e = ad;
        this.f22547e = new C8757e(c4174e, ad, new C17687e(4, this));
        this.f22572e = new C7982e(this, c4174e, ad, c5350e);
        ?? obj2 = new Object();
        obj2.f18968e = new Object();
        obj2.f18967e = null;
        obj2.f18969e = null;
        obj2.f18970e = 0;
        this.f22580e = obj2;
        Looper m2618while = obj2.m2618while();
        this.f22542e = m2618while;
        C2399e ad2 = c17381e.ad(m2618while, this);
        this.f22562e = ad2;
        this.f22563e = new C16683e(context, m2618while, this);
        ad2.vip(35, new InterfaceC17077e() { // from class: eَُۨ
            @Override // defpackage.InterfaceC17077e
            public final void vip(long j2, long j3, C16975e c16975e, MediaFormat mediaFormat) {
                C11246e c11246e = C11246e.this;
                c11246e.getClass();
                interfaceC17077e.vip(j2, j3, c16975e, mediaFormat);
                c11246e.vip(j2, j3, c16975e, mediaFormat);
            }
        }).vip();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eٓۛٛ, java.lang.Object, eًٔ] */
    public static boolean applovin(C0313e c0313e) {
        if (c0313e != null) {
            try {
                ?? r1 = c0313e.ad;
                if (c0313e.appmetrica) {
                    for (InterfaceC4543e interfaceC4543e : c0313e.metrica) {
                        if (interfaceC4543e != null) {
                            interfaceC4543e.smaato();
                        }
                    }
                } else {
                    r1.billing();
                }
                if ((!c0313e.appmetrica ? 0L : r1.license()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: case, reason: not valid java name */
    public static int m3136case(C11501e c11501e, C6158e c6158e, int i, boolean z, Object obj, AbstractC6690e abstractC6690e, AbstractC6690e abstractC6690e2) {
        C11501e c11501e2 = c11501e;
        AbstractC6690e abstractC6690e3 = abstractC6690e;
        Object obj2 = abstractC6690e3.smaato(abstractC6690e3.billing(obj, c6158e).metrica, c11501e, 0L).ad;
        for (int i2 = 0; i2 < abstractC6690e2.loadAd(); i2++) {
            if (abstractC6690e2.smaato(i2, c11501e, 0L).ad.equals(obj2)) {
                return i2;
            }
        }
        int vip = abstractC6690e3.vip(obj);
        int yandex = abstractC6690e3.yandex();
        int i3 = -1;
        int i4 = 0;
        while (i4 < yandex && i3 == -1) {
            AbstractC6690e abstractC6690e4 = abstractC6690e3;
            int license = abstractC6690e4.license(vip, c6158e, c11501e2, i, z);
            if (license == -1) {
                break;
            }
            i3 = abstractC6690e2.vip(abstractC6690e4.advert(license));
            i4++;
            abstractC6690e3 = abstractC6690e4;
            vip = license;
            c11501e2 = c11501e;
        }
        if (i3 == -1) {
            return -1;
        }
        return abstractC6690e2.purchase(i3, c6158e, false).metrica;
    }

    /* renamed from: implements, reason: not valid java name */
    public static Pair m3137implements(AbstractC6690e abstractC6690e, C11573e c11573e, boolean z, int i, boolean z2, C11501e c11501e, C6158e c6158e) {
        int m3136case;
        AbstractC6690e abstractC6690e2 = c11573e.ad;
        if (abstractC6690e.Signature()) {
            return null;
        }
        AbstractC6690e abstractC6690e3 = abstractC6690e2.Signature() ? abstractC6690e : abstractC6690e2;
        try {
            Pair startapp = abstractC6690e3.startapp(c11501e, c6158e, c11573e.vip, c11573e.metrica);
            if (!abstractC6690e.equals(abstractC6690e3)) {
                if (abstractC6690e.vip(startapp.first) == -1) {
                    if (!z || (m3136case = m3136case(c11501e, c6158e, i, z2, startapp.first, abstractC6690e3, abstractC6690e)) == -1) {
                        return null;
                    }
                    return abstractC6690e.startapp(c11501e, c6158e, m3136case, -9223372036854775807L);
                }
                if (abstractC6690e3.billing(startapp.first, c6158e).purchase && abstractC6690e3.smaato(c6158e.metrica, c11501e, 0L).amazon == abstractC6690e3.vip(startapp.first)) {
                    return abstractC6690e.startapp(c11501e, c6158e, abstractC6690e.billing(startapp.first, c6158e).metrica, c11573e.metrica);
                }
            }
            return startapp;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public final long Signature(long j) {
        C0313e c0313e = this.f22547e.advert;
        if (c0313e == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.f22551e - c0313e.Signature));
    }

    /* renamed from: abstract, reason: not valid java name */
    public final void m3138abstract(long j, boolean z) {
        C0313e c0313e = this.f22547e.startapp;
        long j2 = j + (c0313e == null ? 1000000000000L : c0313e.Signature);
        this.f22551e = j2;
        ((C5982e) this.f22544e.f19681e).ad(j2);
        for (C1167e c1167e : this.f22587e) {
            long j3 = this.f22551e;
            AbstractC0241e license = c1167e.license(c0313e);
            if (license != null) {
                license.applovin(j3, false, z);
            }
        }
        for (C0313e c0313e2 = r0.startapp; c0313e2 != null; c0313e2 = c0313e2.smaato) {
            for (InterfaceC17119e interfaceC17119e : (InterfaceC17119e[]) c0313e2.loadAd.f20510e) {
                if (interfaceC17119e != null) {
                    interfaceC17119e.inmobi();
                }
            }
        }
    }

    @Override // defpackage.InterfaceC1145e
    public final void ad(InterfaceC14239e interfaceC14239e) {
        this.f22562e.vip(8, interfaceC14239e).vip();
    }

    public final void adcel(C0313e c0313e, int i, boolean z, long j) {
        C1167e c1167e = this.f22587e[i];
        if (c1167e.yandex()) {
            return;
        }
        boolean z2 = c0313e == this.f22547e.startapp;
        C10379e c10379e = c0313e.loadAd;
        C11443e c11443e = ((C11443e[]) c10379e.f20508e)[i];
        InterfaceC17119e interfaceC17119e = ((InterfaceC17119e[]) c10379e.f20510e)[i];
        boolean z3 = m3159e() && this.f22570e.appmetrica == 3;
        boolean z4 = !z && z3;
        this.f22575e++;
        InterfaceC4543e interfaceC4543e = c0313e.metrica[i];
        long j2 = c0313e.Signature;
        C18208e c18208e = c0313e.billing.ad;
        AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.appmetrica;
        AbstractC0241e abstractC0241e2 = (AbstractC0241e) c1167e.purchase;
        int length = interfaceC17119e != null ? interfaceC17119e.length() : 0;
        C16975e[] c16975eArr = new C16975e[length];
        for (int i2 = 0; i2 < length; i2++) {
            interfaceC17119e.getClass();
            c16975eArr[i2] = interfaceC17119e.amazon(i2);
        }
        int i3 = c1167e.license;
        C9964e c9964e = this.f22544e;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            c1167e.ad = true;
            AbstractC2301e.subscription(abstractC0241e.f1500e == 0);
            abstractC0241e.f1502e = c11443e;
            abstractC0241e.f1497e = c18208e;
            abstractC0241e.f1500e = 1;
            abstractC0241e.mopub(z4, z2);
            abstractC0241e.tapsense(c16975eArr, interfaceC4543e, j, j2, c18208e);
            abstractC0241e.applovin(j, z4, true);
            c9964e.vip(abstractC0241e);
        } else {
            c1167e.vip = true;
            abstractC0241e2.getClass();
            AbstractC2301e.subscription(abstractC0241e2.f1500e == 0);
            abstractC0241e2.f1502e = c11443e;
            abstractC0241e2.f1497e = c18208e;
            abstractC0241e2.f1500e = 1;
            abstractC0241e2.mopub(z4, z2);
            abstractC0241e2.tapsense(c16975eArr, interfaceC4543e, j, j2, c18208e);
            abstractC0241e2.applovin(j, z4, true);
            c9964e.vip(abstractC0241e2);
        }
        C14805e c14805e = new C14805e(this);
        AbstractC0241e license = c1167e.license(c0313e);
        license.getClass();
        license.ad(11, c14805e);
        if (z3 && z2) {
            c1167e.amazon();
        }
    }

    public final void admob(int i) {
        C7422e c7422e = this.f22570e;
        m3158e(i, c7422e.amazon, c7422e.smaato, c7422e.advert);
    }

    public final boolean ads(int i, C18208e c18208e) {
        C8757e c8757e = this.f22547e;
        C0313e c0313e = c8757e.mopub;
        if (c0313e != null && c0313e.billing.ad.equals(c18208e)) {
            C1167e c1167e = this.f22587e[i];
            C0313e c0313e2 = c8757e.mopub;
            int i2 = c1167e.license;
            boolean z = (i2 == 2 || i2 == 4) && c1167e.license(c0313e2) == ((AbstractC0241e) c1167e.appmetrica);
            boolean z2 = c1167e.license == 3 && c1167e.license(c0313e2) == ((AbstractC0241e) c1167e.purchase);
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final void advert(long j, boolean[] zArr) {
        C1167e[] c1167eArr;
        long j2;
        C0313e c0313e = this.f22547e.adcel;
        C10379e c10379e = c0313e.loadAd;
        int i = 0;
        while (true) {
            c1167eArr = this.f22587e;
            if (i >= c1167eArr.length) {
                break;
            }
            if (!c10379e.m2803interface(i)) {
                c1167eArr[i].advert();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < c1167eArr.length) {
            if (c10379e.m2803interface(i2) && c1167eArr[i2].license(c0313e) == null) {
                j2 = j;
                adcel(c0313e, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final long amazon(C0313e c0313e) {
        if (c0313e == null) {
            return 0L;
        }
        long j = c0313e.Signature;
        if (!c0313e.appmetrica) {
            return j;
        }
        int i = 0;
        while (true) {
            C1167e[] c1167eArr = this.f22587e;
            if (i >= c1167eArr.length) {
                return j;
            }
            if (c1167eArr[i].license(c0313e) != null) {
                AbstractC0241e license = c1167eArr[i].license(c0313e);
                Objects.requireNonNull(license);
                long j2 = license.f1490e;
                if (j2 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                j = Math.max(j2, j);
            }
            i++;
        }
    }

    public final boolean appmetrica() {
        if (!this.f22567e) {
            return false;
        }
        for (C1167e c1167e : this.f22587e) {
            if (c1167e.billing()) {
                return true;
            }
        }
        return false;
    }

    public final void billing() {
        AbstractC0241e abstractC0241e;
        if (this.f22567e && appmetrica()) {
            for (C1167e c1167e : this.f22587e) {
                int metrica = c1167e.metrica();
                if (c1167e.billing()) {
                    int i = c1167e.license;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        abstractC0241e = (AbstractC0241e) c1167e.appmetrica;
                    } else {
                        abstractC0241e = (AbstractC0241e) c1167e.purchase;
                        abstractC0241e.getClass();
                    }
                    c1167e.ad(abstractC0241e, this.f22544e);
                    c1167e.adcel(z);
                    c1167e.license = i2;
                }
                this.f22575e -= metrica - c1167e.metrica();
            }
            this.f22549e = -9223372036854775807L;
        }
    }

    /* renamed from: break, reason: not valid java name */
    public final void m3139break() {
        C0313e c0313e = this.f22547e.startapp;
        this.f22588e = c0313e != null && c0313e.billing.adcel && this.f22589e;
    }

    /* renamed from: catch, reason: not valid java name */
    public final void m3140catch(long j) {
        boolean z = this.f22552e;
        long j2 = f22536e;
        if (z) {
            this.f22561e.getClass();
            r2 = this.f22570e.appmetrica != 3 ? j2 : 1000L;
            for (C1167e c1167e : this.f22587e) {
                long j3 = this.f22551e;
                long j4 = this.f22585e;
                AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
                AbstractC0241e abstractC0241e2 = (AbstractC0241e) c1167e.appmetrica;
                long license = C1167e.startapp(abstractC0241e2) ? abstractC0241e2.license(j3, j4) : Long.MAX_VALUE;
                if (abstractC0241e != null && C1167e.startapp(abstractC0241e)) {
                    license = Math.min(license, abstractC0241e.license(j3, j4));
                }
                r2 = Math.min(r2, AbstractC9413e.m2567switch(license));
            }
            if (this.f22570e.smaato()) {
                C0313e c0313e = this.f22547e.startapp;
                C0313e c0313e2 = c0313e != null ? c0313e.smaato : null;
                if (c0313e2 != null) {
                    if ((((float) AbstractC9413e.m2546case(r2)) * this.f22570e.loadAd.ad) + ((float) this.f22551e) >= ((float) c0313e2.appmetrica())) {
                        r2 = Math.min(r2, j2);
                    }
                }
            }
        } else if (this.f22570e.appmetrica != 3 || m3159e()) {
            r2 = j2;
        }
        this.f22562e.ad.sendEmptyMessageAtTime(2, j + r2);
    }

    /* renamed from: class, reason: not valid java name */
    public final void m3141class(int i) {
        C1167e c1167e = this.f22587e[i];
        try {
            C0313e c0313e = this.f22547e.startapp;
            c0313e.getClass();
            AbstractC0241e license = c1167e.license(c0313e);
            license.getClass();
            InterfaceC4543e interfaceC4543e = license.f1503e;
            interfaceC4543e.getClass();
            interfaceC4543e.smaato();
        } catch (IOException | RuntimeException e) {
            int appmetrica = c1167e.appmetrica();
            if (appmetrica != 3 && appmetrica != 5) {
                throw e;
            }
            C10379e c10379e = this.f22547e.startapp.loadAd;
            AbstractC2803e.billing("ExoPlayerImplInternal", "Disabling track due to error: " + C16975e.metrica(((InterfaceC17119e[]) c10379e.f20510e)[i].remoteconfig()), e);
            C10379e c10379e2 = new C10379e((C11443e[]) ((C11443e[]) c10379e.f20508e).clone(), (InterfaceC17119e[]) ((InterfaceC17119e[]) c10379e.f20510e).clone(), (C18255e) c10379e.f20507e, c10379e.f20512e);
            ((C11443e[]) c10379e2.f20508e)[i] = null;
            ((InterfaceC17119e[]) c10379e2.f20510e)[i] = null;
            yandex(i);
            C0313e c0313e2 = this.f22547e.startapp;
            c0313e2.ad(c10379e2, this.f22570e.remoteconfig, false, new boolean[c0313e2.adcel.length]);
        }
    }

    /* renamed from: const, reason: not valid java name */
    public final void m3142const(C2166e c2166e) {
        this.f22557e.purchase(1);
        C7982e c7982e = this.f22572e;
        int size = ((ArrayList) c7982e.metrica).size();
        if (c2166e.vip.length != size) {
            c2166e = new C2166e(new Random(c2166e.ad.nextLong())).ad(0, size);
        }
        c7982e.mopub = c2166e;
        tapsense(c7982e.metrica(), false);
    }

    /* renamed from: continue, reason: not valid java name */
    public final void m3143continue(Object obj, C12594e c12594e) {
        for (C1167e c1167e : this.f22587e) {
            if (c1167e.appmetrica() == 2) {
                int i = c1167e.license;
                if (i == 4 || i == 1) {
                    AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
                    abstractC0241e.getClass();
                    abstractC0241e.ad(1, obj);
                } else {
                    ((AbstractC0241e) c1167e.appmetrica).ad(1, obj);
                }
            }
        }
        int i2 = this.f22570e.appmetrica;
        if (i2 == 3 || i2 == 2) {
            this.f22562e.billing(2);
        }
        if (c12594e != null) {
            c12594e.license();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [eٓۛٛ, java.lang.Object, eًٔ] */
    public final void crashlytics() {
        C8757e c8757e = this.f22547e;
        c8757e.advert();
        C0313e c0313e = c8757e.smaato;
        if (c0313e != null) {
            ?? r1 = c0313e.ad;
            if ((!c0313e.license || c0313e.appmetrica) && !r1.subscription()) {
                AbstractC6690e abstractC6690e = this.f22570e.ad;
                if (c0313e.appmetrica) {
                    r1.admob();
                }
                Iterator it = ((C2734e) this.f22591e).admob.values().iterator();
                while (it.hasNext()) {
                    if (((C16937e) it.next()).vip) {
                        return;
                    }
                }
                if (!c0313e.license) {
                    long j = c0313e.billing.vip;
                    c0313e.license = true;
                    r1.smaato(this, j);
                    return;
                }
                C4042e c4042e = new C4042e();
                c4042e.ad = this.f22551e - c0313e.Signature;
                float f = this.f22544e.isVip().ad;
                AbstractC2301e.billing(f > 0.0f || f == -3.4028235E38f);
                c4042e.vip = f;
                long j2 = this.f22548e;
                AbstractC2301e.billing(j2 >= 0 || j2 == -9223372036854775807L);
                c4042e.metrica = j2;
                C6576e c6576e = new C6576e(c4042e);
                AbstractC2301e.subscription(c0313e.smaato == null);
                r1.loadAd(c6576e);
            }
        }
    }

    /* renamed from: default, reason: not valid java name */
    public final void m3144default(AbstractC6690e abstractC6690e, AbstractC6690e abstractC6690e2) {
        if (abstractC6690e.Signature() && abstractC6690e2.Signature()) {
            return;
        }
        ArrayList arrayList = this.f22556e;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            AbstractC1786e.applovin(arrayList.get(size));
            throw null;
        }
    }

    /* renamed from: else, reason: not valid java name */
    public final void m3145else(boolean z) {
        if (!z) {
            C11573e c11573e = this.f22550e;
            C2399e c2399e = this.f22562e;
            if (c11573e != null && this.f22569e && !c2399e.ad.hasMessages(37)) {
                this.f22573e++;
            }
            int i = this.f22573e;
            if (i > 0) {
                this.f22582e.license(new RunnableC9766e(this, i, 6));
            }
            this.f22573e = 0;
            this.f22569e = false;
            c2399e.purchase(37);
            C11573e c11573e2 = this.f22550e;
            if (c11573e2 != null) {
                m3176super(c11573e2);
                this.f22550e = null;
                this.f22569e = false;
            }
        }
        this.f22552e = z;
        license();
    }

    /* renamed from: extends, reason: not valid java name */
    public final void m3146extends(C12594e c12594e) {
        C9556e c9556e = this.f22580e;
        C2399e c2399e = this.f22562e;
        try {
            m3171protected(true, false, true, false);
            m3180throw();
            InterfaceC17674e interfaceC17674e = this.f22591e;
            C5350e c5350e = this.f22568e;
            C2734e c2734e = (C2734e) interfaceC17674e;
            ConcurrentHashMap concurrentHashMap = c2734e.admob;
            C16937e c16937e = (C16937e) concurrentHashMap.get(c5350e);
            if (c16937e != null) {
                int i = c16937e.ad - 1;
                c16937e.ad = i;
                if (i == 0) {
                    concurrentHashMap.remove(c5350e);
                    c2734e.metrica();
                }
            }
            if (c2734e.admob.isEmpty()) {
                c2734e.subscription = -1L;
            }
            C16683e c16683e = this.f22563e;
            c16683e.metrica = null;
            c16683e.ad();
            c16683e.metrica(0);
            this.f22574e.release();
            m3184volatile(1);
        } finally {
            c2399e.appmetrica();
            c9556e.m2617try();
            c12594e.license();
        }
    }

    /* renamed from: eؑۥؘ, reason: contains not printable characters */
    public final void m3147e() {
        C9964e c9964e = this.f22544e;
        c9964e.f19682e = false;
        C5982e c5982e = (C5982e) c9964e.f19681e;
        if (c5982e.f12596e) {
            c5982e.ad(c5982e.inmobi());
            c5982e.f12596e = false;
        }
        for (C1167e c1167e : this.f22587e) {
            AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
            AbstractC0241e abstractC0241e2 = (AbstractC0241e) c1167e.appmetrica;
            if (C1167e.startapp(abstractC0241e2)) {
                C1167e.vip(abstractC0241e2);
            }
            if (abstractC0241e != null && C1167e.startapp(abstractC0241e)) {
                C1167e.vip(abstractC0241e);
            }
        }
    }

    /* renamed from: eؒۤۨ, reason: contains not printable characters */
    public final void m3148e(boolean z, boolean z2) {
        m3171protected(z || !this.f22576e, false, true, false);
        this.f22557e.purchase(z2 ? 1 : 0);
        C2734e c2734e = (C2734e) this.f22591e;
        ConcurrentHashMap concurrentHashMap = c2734e.admob;
        C5350e c5350e = this.f22568e;
        C16937e c16937e = (C16937e) concurrentHashMap.get(c5350e);
        if (c16937e != null) {
            int i = c16937e.ad - 1;
            c16937e.ad = i;
            if (i == 0) {
                concurrentHashMap.remove(c5350e);
                c2734e.metrica();
            }
        }
        this.f22563e.license(1, this.f22570e.advert);
        m3184volatile(1);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, eًٔ] */
    /* renamed from: eؘْؖ, reason: contains not printable characters */
    public final void m3149e() {
        C0313e c0313e = this.f22547e.advert;
        boolean z = this.f22560e || (c0313e != null && c0313e.ad.subscription());
        C7422e c7422e = this.f22570e;
        if (z != c7422e.billing) {
            this.f22570e = c7422e.vip(z);
        }
    }

    /* renamed from: eٌؖۡ, reason: contains not printable characters */
    public final void m3150e(int i, int i2, List list) {
        this.f22557e.purchase(1);
        C7982e c7982e = this.f22572e;
        c7982e.getClass();
        ArrayList arrayList = (ArrayList) c7982e.metrica;
        AbstractC2301e.billing(i >= 0 && i <= i2 && i2 <= arrayList.size());
        AbstractC2301e.billing(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((C8846e) arrayList.get(i3)).ad.remoteconfig((C1962e) list.get(i3 - i));
        }
        tapsense(c7982e.metrica(), false);
    }

    /* JADX WARN: Type inference failed for: r2v21, types: [eٓۛٛ, java.lang.Object] */
    /* renamed from: eؘؕۥ, reason: contains not printable characters */
    public final void m3151e() {
        long j;
        float f;
        C0313e c0313e = this.f22547e.startapp;
        if (c0313e == null) {
            return;
        }
        long advert = c0313e.appmetrica ? c0313e.ad.advert() : -9223372036854775807L;
        if (advert != -9223372036854775807L) {
            if (!c0313e.billing()) {
                this.f22547e.loadAd(c0313e);
                signatures(false);
                subs();
            }
            m3138abstract(advert, true);
            if (advert != this.f22570e.remoteconfig) {
                C7422e c7422e = this.f22570e;
                this.f22570e = isPro(c7422e.vip, advert, c7422e.metrica, advert, true, 5);
            }
        } else {
            C9964e c9964e = this.f22544e;
            boolean z = c0313e != this.f22547e.adcel;
            C5982e c5982e = (C5982e) c9964e.f19681e;
            AbstractC0241e abstractC0241e = (AbstractC0241e) c9964e.f19680e;
            if (abstractC0241e == null || abstractC0241e.yandex() || ((z && ((AbstractC0241e) c9964e.f19680e).f1500e != 2) || (!((AbstractC0241e) c9964e.f19680e).startapp() && (z || ((AbstractC0241e) c9964e.f19680e).billing())))) {
                c9964e.f19684e = true;
                if (c9964e.f19682e) {
                    c5982e.vip();
                }
            } else {
                InterfaceC7387e interfaceC7387e = (InterfaceC7387e) c9964e.f19685e;
                interfaceC7387e.getClass();
                long inmobi = interfaceC7387e.inmobi();
                if (c9964e.f19684e) {
                    if (inmobi >= c5982e.inmobi()) {
                        c9964e.f19684e = false;
                        if (c9964e.f19682e) {
                            c5982e.vip();
                        }
                    } else if (c5982e.f12596e) {
                        c5982e.ad(c5982e.inmobi());
                        c5982e.f12596e = false;
                    }
                }
                c5982e.ad(inmobi);
                C4194e isVip = interfaceC7387e.isVip();
                if (!isVip.equals((C4194e) c5982e.f12592e)) {
                    c5982e.Signature(isVip);
                    ((C11246e) c9964e.f19683e).f22562e.vip(16, isVip).vip();
                }
            }
            long inmobi2 = c9964e.inmobi();
            this.f22551e = inmobi2;
            long j2 = inmobi2 - c0313e.Signature;
            long j3 = this.f22570e.remoteconfig;
            if (!this.f22556e.isEmpty() && !this.f22570e.vip.vip()) {
                if (this.f22583e) {
                    this.f22583e = false;
                }
                C7422e c7422e2 = this.f22570e;
                c7422e2.ad.vip(c7422e2.vip.ad);
                int min = Math.min(this.f22594e, this.f22556e.size());
                if (min > 0 && this.f22556e.get(min - 1) != null) {
                    throw new ClassCastException();
                }
                if (min < this.f22556e.size() && this.f22556e.get(min) != null) {
                    throw new ClassCastException();
                }
                this.f22594e = min;
            }
            if (this.f22544e.isPro()) {
                boolean z2 = !this.f22557e.appmetrica;
                C7422e c7422e3 = this.f22570e;
                this.f22570e = isPro(c7422e3.vip, j2, c7422e3.metrica, j2, z2, 6);
            } else {
                C7422e c7422e4 = this.f22570e;
                c7422e4.remoteconfig = j2;
                c7422e4.pro = SystemClock.elapsedRealtime();
            }
        }
        this.f22570e.admob = this.f22547e.advert.license();
        C7422e c7422e5 = this.f22570e;
        c7422e5.subscription = Signature(c7422e5.admob);
        C7422e c7422e6 = this.f22570e;
        if (c7422e6.advert && c7422e6.appmetrica == 3 && m3153e(c7422e6.ad, c7422e6.vip)) {
            C7422e c7422e7 = this.f22570e;
            float f2 = 1.0f;
            if (c7422e7.loadAd.ad == 1.0f) {
                C5635e c5635e = this.f22592e;
                long smaato = smaato(c7422e7.ad, c7422e7.vip.ad, c7422e7.remoteconfig);
                long j4 = this.f22570e.subscription;
                if (c5635e.metrica != -9223372036854775807L) {
                    long j5 = smaato - j4;
                    if (c5635e.smaato == -9223372036854775807L) {
                        c5635e.smaato = j5;
                        c5635e.amazon = 0L;
                    } else {
                        c5635e.smaato = Math.max(j5, (((float) j5) * 9.999871E-4f) + (((float) r9) * 0.999f));
                        c5635e.amazon = (9.999871E-4f * ((float) Math.abs(j5 - r9))) + (((float) c5635e.amazon) * 0.999f);
                    }
                    if (c5635e.advert != -9223372036854775807L) {
                        j = 1000;
                        if (SystemClock.elapsedRealtime() - c5635e.advert < 1000) {
                            f2 = c5635e.mopub;
                        }
                    } else {
                        j = 1000;
                    }
                    c5635e.advert = SystemClock.elapsedRealtime();
                    long j6 = (c5635e.amazon * 3) + c5635e.smaato;
                    if (c5635e.yandex > j6) {
                        float m2546case = (float) AbstractC9413e.m2546case(j);
                        f = 1.0E-7f;
                        long[] jArr = {j6, c5635e.appmetrica, c5635e.yandex - (((c5635e.mopub - 1.0f) * m2546case) + ((c5635e.startapp - 1.0f) * m2546case))};
                        long j7 = jArr[0];
                        for (int i = 1; i < 3; i++) {
                            long j8 = jArr[i];
                            if (j8 > j7) {
                                j7 = j8;
                            }
                        }
                        c5635e.yandex = j7;
                    } else {
                        f = 1.0E-7f;
                        long mopub = AbstractC9413e.mopub(smaato - (Math.max(0.0f, c5635e.mopub - 1.0f) / 1.0E-7f), c5635e.yandex, j6);
                        c5635e.yandex = mopub;
                        long j9 = c5635e.billing;
                        if (j9 != -9223372036854775807L && mopub > j9) {
                            c5635e.yandex = j9;
                        }
                    }
                    long j10 = smaato - c5635e.yandex;
                    if (Math.abs(j10) < c5635e.ad) {
                        c5635e.mopub = 1.0f;
                    } else {
                        c5635e.mopub = AbstractC9413e.startapp((f * ((float) j10)) + 1.0f, c5635e.adcel, c5635e.startapp);
                    }
                    f2 = c5635e.mopub;
                }
                if (this.f22544e.isVip().ad != f2) {
                    C4194e c4194e = new C4194e(f2, this.f22570e.loadAd.vip);
                    this.f22562e.purchase(16);
                    this.f22544e.Signature(c4194e);
                    inmobi(this.f22570e.loadAd, this.f22544e.isVip().ad, false, false);
                }
            }
        }
    }

    /* renamed from: eؘُٔ, reason: contains not printable characters */
    public final void m3152e(AbstractC6690e abstractC6690e, C18208e c18208e, AbstractC6690e abstractC6690e2, C18208e c18208e2, long j, boolean z) {
        boolean m3153e = m3153e(abstractC6690e, c18208e);
        Object obj = c18208e.ad;
        if (!m3153e) {
            C4194e c4194e = c18208e.vip() ? C4194e.license : this.f22570e.loadAd;
            C9964e c9964e = this.f22544e;
            if (c9964e.isVip().equals(c4194e)) {
                return;
            }
            this.f22562e.purchase(16);
            c9964e.Signature(c4194e);
            inmobi(this.f22570e.loadAd, c4194e.ad, false, false);
            return;
        }
        C6158e c6158e = this.f22540e;
        int i = abstractC6690e.billing(obj, c6158e).metrica;
        C11501e c11501e = this.f22566e;
        abstractC6690e.amazon(i, c11501e);
        C15197e c15197e = c11501e.adcel;
        C5635e c5635e = this.f22592e;
        c5635e.getClass();
        c5635e.metrica = AbstractC9413e.m2546case(c15197e.ad);
        c5635e.purchase = AbstractC9413e.m2546case(c15197e.vip);
        c5635e.billing = AbstractC9413e.m2546case(c15197e.metrica);
        float f = c15197e.license;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        c5635e.adcel = f;
        float f2 = c15197e.appmetrica;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        c5635e.startapp = f2;
        if (f == 1.0f && f2 == 1.0f) {
            c5635e.metrica = -9223372036854775807L;
        }
        c5635e.ad();
        if (j != -9223372036854775807L) {
            c5635e.license = smaato(abstractC6690e, obj, j);
            c5635e.ad();
            return;
        }
        if (!Objects.equals(!abstractC6690e2.Signature() ? abstractC6690e2.smaato(abstractC6690e2.billing(c18208e2.ad, c6158e).metrica, c11501e, 0L).ad : null, c11501e.ad) || z) {
            c5635e.license = -9223372036854775807L;
            c5635e.ad();
        }
    }

    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final boolean m3153e(AbstractC6690e abstractC6690e, C18208e c18208e) {
        if (c18208e.vip() || abstractC6690e.Signature()) {
            return false;
        }
        int i = abstractC6690e.billing(c18208e.ad, this.f22540e).metrica;
        C11501e c11501e = this.f22566e;
        abstractC6690e.amazon(i, c11501e);
        return c11501e.ad() && c11501e.startapp && c11501e.purchase != -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:20:0x00a7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5 A[SYNTHETIC] */
    /* renamed from: eُٓؓ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3154e(defpackage.C18208e r10, defpackage.C10379e r11) {
        /*
            r9 = this;
            eٌُ٘ r0 = r9.f22547e
            eؑٔۢ r0 = r0.advert
            r0.getClass()
            long r1 = r0.license()
            r9.Signature(r1)
            eؚۙٗ r1 = r9.f22570e
            eؙ۠ؐ r1 = r1.ad
            eٕۚؓ r0 = r0.billing
            eَٛ r0 = r0.ad
            boolean r0 = r9.m3153e(r1, r0)
            if (r0 == 0) goto L20
            eؘَٔ r0 = r9.f22592e
            long r0 = r0.yandex
        L20:
            eؚۙٗ r0 = r9.f22570e
            eؙ۠ؐ r0 = r0.ad
            eَؐٚ r1 = r9.f22544e
            eؚؖٚ r1 = r1.isVip()
            float r1 = r1.ad
            eؚۙٗ r1 = r9.f22570e
            boolean r1 = r1.advert
            java.lang.Object r11 = r11.f20510e
            eُٗٛ[] r11 = (defpackage.InterfaceC17119e[]) r11
            eَ٘ۧ r1 = r9.f22591e
            eْؔٝ r1 = (defpackage.C2734e) r1
            r1.getClass()
            eٌّؗ r2 = r1.Signature
            eٍؘؑ r3 = r9.f22568e
            java.lang.String r4 = r3.ad
            java.lang.Object r2 = r2.get(r4)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r4 = -1
            if (r2 == 0) goto L55
            int r5 = r2.intValue()
            if (r5 == r4) goto L55
            int r2 = r2.intValue()
            goto L57
        L55:
            int r2 = r1.advert
        L57:
            j$.util.concurrent.ConcurrentHashMap r5 = r1.admob
            java.lang.Object r3 = r5.get(r3)
            eُٗۙ r3 = (defpackage.C16937e) r3
            r3.getClass()
            if (r2 != r4) goto Lcb
            java.lang.Object r10 = r10.ad
            eؙؚؔ r2 = r1.vip
            eؙؚؔ r10 = r0.billing(r10, r2)
            int r10 = r10.metrica
            eِؔۨ r2 = r1.ad
            r4 = 0
            eِؔۨ r10 = r0.smaato(r10, r2, r4)
            eِؓٝ r10 = r10.metrica
            eٌَٗ r10 = r10.vip
            r0 = 0
            if (r10 != 0) goto L7f
        L7d:
            r10 = r0
            goto L94
        L7f:
            android.net.Uri r10 = r10.ad
            java.lang.String r10 = r10.getScheme()
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L93
            eؒۢۗ r2 = defpackage.C2734e.remoteconfig
            boolean r10 = r2.contains(r10)
            if (r10 == 0) goto L7d
        L93:
            r10 = 1
        L94:
            int r2 = r11.length
            r4 = r0
            r5 = r4
        L97:
            r6 = 13107200(0xc80000, float:1.8367099E-38)
            if (r4 >= r2) goto Lc5
            r7 = r11[r4]
            if (r7 == 0) goto Lc2
            eٖۗٙ r7 = r7.adcel()
            int r7 = r7.metrica
            r8 = 131072(0x20000, float:1.83671E-40)
            switch(r7) {
                case -2: goto Lc0;
                case -1: goto Lc1;
                case 0: goto Lbd;
                case 1: goto Lc1;
                case 2: goto Lb5;
                case 3: goto Lb0;
                case 4: goto Lb2;
                case 5: goto Lb0;
                case 6: goto Lb0;
                default: goto Laa;
            }
        Laa:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>()
            throw r10
        Lb0:
            r6 = r8
            goto Lc1
        Lb2:
            r6 = 26214400(0x1900000, float:5.2897246E-38)
            goto Lc1
        Lb5:
            if (r10 == 0) goto Lba
            r6 = 19660800(0x12c0000, float:3.159141E-38)
            goto Lc1
        Lba:
            r6 = 131072000(0x7d00000, float:3.1296362E-34)
            goto Lc1
        Lbd:
            r6 = 144310272(0x89a0000, float:9.268538E-34)
            goto Lc1
        Lc0:
            r6 = r0
        Lc1:
            int r5 = r5 + r6
        Lc2:
            int r4 = r4 + 1
            goto L97
        Lc5:
            r10 = 210239488(0xc880000, float:2.0954118E-31)
            int r2 = defpackage.AbstractC9413e.adcel(r5, r6, r10)
        Lcb:
            r3.metrica = r2
            r1.metrica()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.m3154e(eَٛ, eَٜؐ):void");
    }

    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final void m3155e() {
        C0313e c0313e = this.f22547e.startapp;
        if (c0313e == null) {
            return;
        }
        C10379e c10379e = c0313e.loadAd;
        int i = 0;
        while (true) {
            C1167e[] c1167eArr = this.f22587e;
            if (i >= c1167eArr.length) {
                return;
            }
            if (c10379e.m2803interface(i)) {
                c1167eArr[i].amazon();
            }
            i++;
        }
    }

    /* renamed from: eٓٛۢ, reason: contains not printable characters */
    public final void m3156e(boolean z, boolean z2) {
        long j;
        this.f22538e = z;
        if (!z || z2) {
            j = -9223372036854775807L;
        } else {
            this.f22558e.getClass();
            j = SystemClock.elapsedRealtime();
        }
        this.f22548e = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x02b4, code lost:
    
        if ((((float) (r3.appmetrica() - r23.f22551e)) / r23.f22544e.isVip().ad) > 10000000) goto L252;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04cd  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0523  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x05d4  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x05df  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x024a  */
    /* JADX WARN: Type inference failed for: r1v49, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v58, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [eٍؚؒ, java.lang.Object] */
    /* renamed from: eّٔؖ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3157e() {
        /*
            Method dump skipped, instructions count: 1554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.m3157e():void");
    }

    /* renamed from: eٟٗۦ, reason: contains not printable characters */
    public final void m3158e(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        boolean z3 = this.f22552e;
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = z3 ? 4 : 0;
        }
        C7422e c7422e = this.f22570e;
        if (c7422e.advert == z2 && c7422e.amazon == i2 && c7422e.smaato == i3) {
            return;
        }
        this.f22570e = c7422e.appmetrica(i3, i2, z2);
        m3156e(false, false);
        C8757e c8757e = this.f22547e;
        for (C0313e c0313e = c8757e.startapp; c0313e != null; c0313e = c0313e.smaato) {
            for (InterfaceC17119e interfaceC17119e : (InterfaceC17119e[]) c0313e.loadAd.f20510e) {
                if (interfaceC17119e != null) {
                    interfaceC17119e.smaato(z2);
                }
            }
        }
        if (!m3159e()) {
            m3147e();
            m3151e();
            C7422e c7422e2 = this.f22570e;
            if (c7422e2.Signature) {
                this.f22570e = c7422e2.startapp(false);
            }
            c8757e.amazon(this.f22551e);
            return;
        }
        int i4 = this.f22570e.appmetrica;
        C2399e c2399e = this.f22562e;
        if (i4 != 3) {
            if (i4 == 2) {
                c2399e.billing(2);
            }
        } else {
            C9964e c9964e = this.f22544e;
            c9964e.f19682e = true;
            ((C5982e) c9964e.f19681e).vip();
            m3155e();
            c2399e.billing(2);
        }
    }

    /* renamed from: eؙٟ٘, reason: contains not printable characters */
    public final boolean m3159e() {
        C7422e c7422e = this.f22570e;
        return c7422e.advert && c7422e.amazon == 0;
    }

    /* renamed from: final, reason: not valid java name */
    public final void m3160final(boolean z) {
        C18208e c18208e = this.f22547e.startapp.billing.ad;
        long m3168new = m3168new(c18208e, this.f22570e.remoteconfig, true, false);
        if (m3168new != this.f22570e.remoteconfig) {
            C7422e c7422e = this.f22570e;
            this.f22570e = isPro(c18208e, m3168new, c7422e.metrica, c7422e.license, z, 5);
        }
    }

    /* renamed from: finally, reason: not valid java name */
    public final void m3161finally(boolean z) {
        this.f22586e = z;
        AbstractC6690e abstractC6690e = this.f22570e.ad;
        C8757e c8757e = this.f22547e;
        c8757e.yandex = z;
        int remoteconfig = c8757e.remoteconfig(abstractC6690e);
        if ((remoteconfig & 1) != 0) {
            m3160final(true);
        } else if ((remoteconfig & 2) != 0) {
            billing();
        }
        signatures(false);
    }

    public final void firebase() {
        C6981e c6981e = this.f22557e;
        C7422e c7422e = this.f22570e;
        boolean z = c6981e.license | (((C7422e) c6981e.purchase) != c7422e);
        c6981e.license = z;
        c6981e.purchase = c7422e;
        if (z) {
            C17148e c17148e = this.f22555e.f13281e;
            c17148e.f33605e.license(new RunnableC2623e(c17148e, c6981e, 20));
            this.f22557e = new C6981e(this.f22570e);
        }
    }

    /* renamed from: for, reason: not valid java name */
    public final void m3162for(InterfaceC17077e interfaceC17077e) {
        for (C1167e c1167e : this.f22587e) {
            if (c1167e.appmetrica() == 2 || c1167e.appmetrica() == 4) {
                ((AbstractC0241e) c1167e.appmetrica).ad(7, interfaceC17077e);
                AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
                if (abstractC0241e != null) {
                    abstractC0241e.ad(7, interfaceC17077e);
                }
            }
        }
    }

    /* renamed from: goto, reason: not valid java name */
    public final void m3163goto() {
        tapsense(this.f22572e.metrica(), true);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i;
        int i2;
        C0313e c0313e;
        C18208e c18208e;
        C0313e c0313e2;
        try {
            switch (message.what) {
                case 1:
                    boolean z = message.arg1 != 0;
                    int i3 = message.arg2;
                    this.f22557e.purchase(1);
                    m3158e(this.f22563e.license(this.f22570e.appmetrica, z), i3 >> 4, i3 & 15, z);
                    break;
                case 2:
                    startapp();
                    break;
                case 3:
                    m3176super((C11573e) message.obj);
                    break;
                case 4:
                    m3174static((C4194e) message.obj);
                    break;
                case 5:
                    m3181throws((C1198e) message.obj);
                    break;
                case 6:
                    m3148e(false, true);
                    break;
                case 7:
                    m3146extends((C12594e) message.obj);
                    return true;
                case 8:
                    isVip((InterfaceC14239e) message.obj);
                    break;
                case 9:
                    remoteconfig((InterfaceC14239e) message.obj);
                    break;
                case 10:
                    m3183try();
                    break;
                case 11:
                    m3173return(message.arg1);
                    break;
                case 12:
                    m3161finally(message.arg1 != 0);
                    break;
                case 13:
                    m3182transient(message.arg1 != 0, (C12594e) message.obj);
                    break;
                case 14:
                    m3175strictfp((C1520e) message.obj);
                    break;
                case 15:
                    m3170private((C1520e) message.obj);
                    break;
                case 16:
                    C4194e c4194e = (C4194e) message.obj;
                    inmobi(c4194e, c4194e.ad, true, false);
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                    m3164import((C4757e) message.obj);
                    break;
                case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                    metrica((C4757e) message.obj, message.arg1);
                    break;
                case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                    m3179this((C4506e) message.obj);
                    break;
                case 20:
                    m3185while(message.arg1, message.arg2, (C2166e) message.obj);
                    break;
                case 21:
                    m3142const((C2166e) message.obj);
                    break;
                case 22:
                    m3163goto();
                    break;
                case 23:
                    m3165instanceof(message.arg1 != 0);
                    break;
                case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                default:
                    return false;
                case Maneuver.TYPE_FORK_LEFT /* 25 */:
                    purchase();
                    break;
                case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                    m3183try();
                    m3160final(true);
                    break;
                case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                    m3150e(message.arg1, message.arg2, (List) message.obj);
                    break;
                case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                    m3178synchronized((C4610e) message.obj);
                    break;
                case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                    m3167native();
                    break;
                case 30:
                    Pair pair = (Pair) message.obj;
                    m3143continue(pair.first, (C12594e) pair.second);
                    break;
                case 31:
                    m3169package((C3335e) message.obj, message.arg1 != 0);
                    break;
                case 32:
                    m3172public(((Float) message.obj).floatValue());
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                    admob(message.arg1);
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                    subscription();
                    break;
                case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                    m3162for((InterfaceC17077e) message.obj);
                    break;
                case Maneuver.TYPE_STRAIGHT /* 36 */:
                    m3145else(((Boolean) message.obj).booleanValue());
                    break;
                case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                    this.f22569e = false;
                    C11573e c11573e = this.f22550e;
                    if (c11573e != null) {
                        m3176super(c11573e);
                        this.f22550e = null;
                        break;
                    }
                    break;
                case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                    m3177switch((C17615e) message.obj);
                    break;
            }
        } catch (C3906e e) {
            pro(1002, e);
        } catch (C5681e e2) {
            e = e2;
            int i4 = e.f12055e;
            C8757e c8757e = this.f22547e;
            if (i4 == 1 && (c0313e2 = c8757e.adcel) != null && e.f12057e == null) {
                e = e.metrica(c0313e2.billing.ad);
            }
            int i5 = e.f12055e;
            C2399e c2399e = this.f22562e;
            if (i5 == 1 && (c18208e = e.f12057e) != null && ads(e.f12054e, c18208e)) {
                this.f22545e = true;
                billing();
                C0313e yandex = c8757e.yandex();
                C0313e c0313e3 = c8757e.startapp;
                if (c0313e3 != yandex) {
                    while (c0313e3 != null) {
                        C0313e c0313e4 = c0313e3.smaato;
                        if (c0313e4 == yandex) {
                            break;
                        }
                        c0313e3 = c0313e4;
                    }
                }
                c8757e.loadAd(c0313e3);
                if (this.f22570e.appmetrica != 4) {
                    subs();
                    c2399e.billing(2);
                }
            } else {
                C5681e c5681e = this.f22578e;
                if (c5681e != null) {
                    c5681e.addSuppressed(e);
                    e = this.f22578e;
                }
                if (e.f12055e == 1 && c8757e.startapp != c8757e.adcel) {
                    while (true) {
                        c0313e = c8757e.startapp;
                        if (c0313e == c8757e.adcel) {
                            break;
                        }
                        c8757e.ad();
                    }
                    AbstractC2301e.advert(c0313e);
                    firebase();
                    C15701e c15701e = c0313e.billing;
                    C18208e c18208e2 = c15701e.ad;
                    long j = c15701e.vip;
                    this.f22570e = isPro(c18208e2, j, c15701e.license, j, true, 0);
                }
                if (e.f12058e && (this.f22578e == null || (i2 = e.f16770e) == 5004 || i2 == 5003)) {
                    AbstractC2803e.amazon("ExoPlayerImplInternal", "Recoverable renderer error", e);
                    if (this.f22578e == null) {
                        this.f22578e = e;
                    }
                    C12414e vip = c2399e.vip(25, e);
                    Handler handler = c2399e.ad;
                    Message message2 = vip.ad;
                    message2.getClass();
                    handler.sendMessageAtFrontOfQueue(message2);
                    vip.ad();
                } else {
                    AbstractC2803e.billing("ExoPlayerImplInternal", "Playback error", e);
                    m3148e(true, false);
                    this.f22570e = this.f22570e.purchase(e);
                }
            }
        } catch (C7923e e3) {
            pro(e3.f16038e, e3);
        } catch (C15125e e4) {
            boolean z2 = e4.f29909e;
            int i6 = e4.f29908e;
            if (i6 == 1) {
                i = z2 ? 3001 : 3003;
            } else {
                if (i6 == 4) {
                    i = z2 ? 3002 : 3004;
                }
                pro(r3, e4);
            }
            r3 = i;
            pro(r3, e4);
        } catch (C18297e e5) {
            pro(e5.f35943e, e5);
        } catch (IOException e6) {
            pro(2000, e6);
        } catch (RuntimeException e7) {
            C5681e c5681e2 = new C5681e(2, e7, ((e7 instanceof IllegalStateException) || (e7 instanceof IllegalArgumentException)) ? 1004 : 1000);
            AbstractC2803e.billing("ExoPlayerImplInternal", "Playback error", c5681e2);
            m3148e(true, false);
            this.f22570e = this.f22570e.purchase(c5681e2);
        }
        firebase();
        return true;
    }

    /* renamed from: import, reason: not valid java name */
    public final void m3164import(C4757e c4757e) {
        this.f22557e.purchase(1);
        int i = c4757e.metrica;
        C2166e c2166e = c4757e.vip;
        ArrayList arrayList = c4757e.ad;
        if (i != -1) {
            this.f22559e = new C11573e(new C9189e(arrayList, c2166e), c4757e.metrica, c4757e.license);
        }
        C7982e c7982e = this.f22572e;
        ArrayList arrayList2 = (ArrayList) c7982e.metrica;
        c7982e.startapp(0, arrayList2.size());
        tapsense(c7982e.ad(arrayList2.size(), arrayList, c2166e), false);
    }

    public final void inmobi(C4194e c4194e, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.f22557e.purchase(1);
            }
            this.f22570e = this.f22570e.billing(c4194e);
        }
        float f2 = c4194e.ad;
        C0313e c0313e = this.f22547e.startapp;
        while (true) {
            i = 0;
            if (c0313e == null) {
                break;
            }
            InterfaceC17119e[] interfaceC17119eArr = (InterfaceC17119e[]) c0313e.loadAd.f20510e;
            int length = interfaceC17119eArr.length;
            while (i < length) {
                InterfaceC17119e interfaceC17119e = interfaceC17119eArr[i];
                if (interfaceC17119e != null) {
                    interfaceC17119e.tapsense(f2);
                }
                i++;
            }
            c0313e = c0313e.smaato;
        }
        C1167e[] c1167eArr = this.f22587e;
        int length2 = c1167eArr.length;
        while (i < length2) {
            C1167e c1167e = c1167eArr[i];
            float f3 = c4194e.ad;
            ((AbstractC0241e) c1167e.appmetrica).ads(f, f3);
            AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
            if (abstractC0241e != null) {
                abstractC0241e.ads(f, f3);
            }
            i++;
        }
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m3165instanceof(boolean z) {
        this.f22589e = z;
        m3139break();
        if (this.f22588e) {
            C8757e c8757e = this.f22547e;
            if (c8757e.adcel != c8757e.startapp) {
                m3160final(true);
                signatures(false);
            }
        }
    }

    /* renamed from: interface, reason: not valid java name */
    public final void m3166interface(final int i, final boolean z) {
        boolean[] zArr = this.f22541e;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.f22582e.license(new Runnable() { // from class: eٌٞ٘
                @Override // java.lang.Runnable
                public final void run() {
                    C11246e c11246e = C11246e.this;
                    C4174e c4174e = c11246e.f22579e;
                    C1167e[] c1167eArr = c11246e.f22587e;
                    final int i2 = i;
                    final int appmetrica = c1167eArr[i2].appmetrica();
                    final C18177e m1494package = c4174e.m1494package();
                    final boolean z2 = z;
                    c4174e.m1501transient(m1494package, 1033, new InterfaceC12504e() { // from class: eًۘۖ
                        @Override // defpackage.InterfaceC12504e
                        public final void invoke(Object obj) {
                            ((InterfaceC3190e) obj).subs(C18177e.this, i2, appmetrica, z2);
                        }
                    });
                }
            });
        }
    }

    /* JADX WARN: Type inference failed for: r11v3, types: [eّۗؐ, eْٗۤ] */
    public final C7422e isPro(C18208e c18208e, long j, long j2, long j3, boolean z, int i) {
        C1410e c1410e;
        boolean z2;
        this.f22583e = (!this.f22583e && j == this.f22570e.remoteconfig && c18208e.equals(this.f22570e.vip)) ? false : true;
        m3139break();
        C7422e c7422e = this.f22570e;
        C12931e c12931e = c7422e.yandex;
        C10379e c10379e = c7422e.startapp;
        List list = c7422e.adcel;
        if (this.f22572e.ad) {
            C0313e c0313e = this.f22547e.startapp;
            c12931e = c0313e == null ? C12931e.license : c0313e.amazon;
            c10379e = c0313e == null ? this.f22537e : c0313e.loadAd;
            InterfaceC17119e[] interfaceC17119eArr = (InterfaceC17119e[]) c10379e.f20510e;
            ?? abstractC12670e = new AbstractC12670e(4);
            boolean z3 = false;
            for (InterfaceC17119e interfaceC17119e : interfaceC17119eArr) {
                if (interfaceC17119e != null) {
                    C17750e c17750e = interfaceC17119e.amazon(0).advert;
                    if (c17750e == null) {
                        abstractC12670e.metrica(new C17750e(new InterfaceC16707e[0]));
                    } else {
                        abstractC12670e.metrica(c17750e);
                        z3 = true;
                    }
                }
            }
            if (z3) {
                c1410e = abstractC12670e.billing();
            } else {
                C2171e c2171e = AbstractC17475e.f34223e;
                c1410e = C1410e.f4222e;
            }
            list = c1410e;
            if (c0313e != null) {
                C15701e c15701e = c0313e.billing;
                if (c15701e.license != j2) {
                    c0313e.billing = c15701e.ad(j2);
                }
            }
            C1167e[] c1167eArr = this.f22587e;
            C8757e c8757e = this.f22547e;
            C0313e c0313e2 = c8757e.startapp;
            if (c0313e2 == c8757e.adcel && c0313e2 != null) {
                C10379e c10379e2 = c0313e2.loadAd;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= c1167eArr.length) {
                        z2 = true;
                        break;
                    }
                    if (c10379e2.m2803interface(i2)) {
                        if (c1167eArr[i2].appmetrica() != 1) {
                            z2 = false;
                            break;
                        }
                        if (((C11443e[]) c10379e2.f20508e)[i2].ad != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.f22593e) {
                    this.f22593e = z5;
                    if (!z5 && this.f22570e.Signature) {
                        this.f22562e.billing(2);
                    }
                }
            }
        } else if (!c18208e.equals(c7422e.vip)) {
            c12931e = C12931e.license;
            c10379e = this.f22537e;
            list = C1410e.f4222e;
        }
        C12931e c12931e2 = c12931e;
        C10379e c10379e3 = c10379e;
        List list2 = list;
        if (z) {
            C6981e c6981e = this.f22557e;
            if (!c6981e.appmetrica || c6981e.metrica == 5) {
                c6981e.license = true;
                c6981e.appmetrica = true;
                c6981e.metrica = i;
            } else {
                AbstractC2301e.billing(i == 5);
            }
        }
        C7422e c7422e2 = this.f22570e;
        return c7422e2.license(c18208e, j, j2, j3, Signature(c7422e2.admob), c12931e2, c10379e3, list2);
    }

    public final void isVip(InterfaceC14239e interfaceC14239e) {
        C0313e c0313e;
        C8757e c8757e = this.f22547e;
        C0313e c0313e2 = c8757e.advert;
        C9964e c9964e = this.f22544e;
        if (c0313e2 != null && c0313e2.ad == interfaceC14239e) {
            c0313e2.getClass();
            if (!c0313e2.appmetrica) {
                float f = c9964e.isVip().ad;
                C7422e c7422e = this.f22570e;
                c0313e2.purchase(f, c7422e.ad, c7422e.advert);
            }
            m3154e(c0313e2.billing.ad, c0313e2.loadAd);
            if (c0313e2 == c8757e.startapp) {
                m3138abstract(c0313e2.billing.vip, true);
                advert(c8757e.adcel.appmetrica(), new boolean[this.f22587e.length]);
                c0313e2.yandex = true;
                C7422e c7422e2 = this.f22570e;
                C18208e c18208e = c7422e2.vip;
                long j = c0313e2.billing.vip;
                this.f22570e = isPro(c18208e, j, c7422e2.metrica, j, false, 5);
            }
            subs();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= c8757e.admob.size()) {
                c0313e = null;
                break;
            }
            c0313e = (C0313e) c8757e.admob.get(i);
            if (c0313e.ad == interfaceC14239e) {
                break;
            } else {
                i++;
            }
        }
        if (c0313e != null) {
            AbstractC2301e.subscription(true ^ c0313e.appmetrica);
            float f2 = c9964e.isVip().ad;
            C7422e c7422e3 = this.f22570e;
            c0313e.purchase(f2, c7422e3.ad, c7422e3.advert);
            C0313e c0313e3 = c8757e.smaato;
            if (c0313e3 == null || c0313e3.ad != interfaceC14239e) {
                return;
            }
            crashlytics();
        }
    }

    public final void license() {
        for (C1167e c1167e : this.f22587e) {
            C17615e c17615e = this.f22552e ? this.f22561e : null;
            ((AbstractC0241e) c1167e.appmetrica).ad(18, c17615e);
            AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
            if (abstractC0241e != null) {
                abstractC0241e.ad(18, c17615e);
            }
        }
    }

    public final Pair loadAd(AbstractC6690e abstractC6690e) {
        if (abstractC6690e.Signature()) {
            return Pair.create(C7422e.signatures, 0L);
        }
        Pair startapp = abstractC6690e.startapp(this.f22566e, this.f22540e, abstractC6690e.ad(this.f22586e), -9223372036854775807L);
        C18208e admob = this.f22547e.admob(abstractC6690e, startapp.first, 0L);
        long longValue = ((Long) startapp.second).longValue();
        if (admob.vip()) {
            Object obj = admob.ad;
            C6158e c6158e = this.f22540e;
            abstractC6690e.billing(obj, c6158e);
            longValue = admob.metrica == c6158e.purchase(admob.vip) ? c6158e.billing.vip : 0L;
        }
        return Pair.create(admob, Long.valueOf(longValue));
    }

    public final void metrica(C4757e c4757e, int i) {
        this.f22557e.purchase(1);
        C7982e c7982e = this.f22572e;
        if (i == -1) {
            i = ((ArrayList) c7982e.metrica).size();
        }
        tapsense(c7982e.ad(i, c4757e.ad, c4757e.vip), false);
    }

    @Override // defpackage.InterfaceC13344e
    public final void mopub(InterfaceC14585e interfaceC14585e) {
        this.f22562e.vip(9, (InterfaceC14239e) interfaceC14585e).vip();
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, eُٗۙ] */
    /* renamed from: native, reason: not valid java name */
    public final void m3167native() {
        this.f22557e.purchase(1);
        m3171protected(false, false, false, true);
        C2734e c2734e = (C2734e) this.f22591e;
        ConcurrentHashMap concurrentHashMap = c2734e.admob;
        long id = Thread.currentThread().getId();
        long j = c2734e.subscription;
        AbstractC2301e.admob("Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).", j == -1 || j == id);
        c2734e.subscription = id;
        C5350e c5350e = this.f22568e;
        C16937e c16937e = (C16937e) concurrentHashMap.get(c5350e);
        if (c16937e == null) {
            ?? obj = new Object();
            obj.ad = 1;
            concurrentHashMap.put(c5350e, obj);
        } else {
            c16937e.ad++;
        }
        C16937e c16937e2 = (C16937e) concurrentHashMap.get(c5350e);
        c16937e2.getClass();
        Integer num = (Integer) c2734e.Signature.get(c5350e.ad);
        int intValue = (num == null || num.intValue() == -1) ? c2734e.advert : num.intValue();
        if (intValue == -1) {
            intValue = 13107200;
        }
        c16937e2.metrica = intValue;
        c16937e2.vip = false;
        m3184volatile(this.f22570e.ad.Signature() ? 4 : 2);
        C7422e c7422e = this.f22570e;
        boolean z = c7422e.advert;
        m3158e(this.f22563e.license(c7422e.appmetrica, z), c7422e.amazon, c7422e.smaato, z);
        C10573e c10573e = (C10573e) this.f22590e;
        c10573e.getClass();
        C7982e c7982e = this.f22572e;
        ArrayList arrayList = (ArrayList) c7982e.metrica;
        AbstractC2301e.subscription(!c7982e.ad);
        c7982e.advert = c10573e;
        for (int i = 0; i < arrayList.size(); i++) {
            C8846e c8846e = (C8846e) arrayList.get(i);
            c7982e.billing(c8846e);
            ((HashSet) c7982e.yandex).add(c8846e);
        }
        c7982e.ad = true;
        this.f22562e.billing(2);
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v15, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v24, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v25, types: [eٓۛٛ, java.lang.Object] */
    /* renamed from: new, reason: not valid java name */
    public final long m3168new(C18208e c18208e, long j, boolean z, boolean z2) {
        C8757e c8757e;
        m3147e();
        boolean z3 = true;
        m3156e(false, true);
        if (z2 || this.f22570e.appmetrica == 3) {
            m3184volatile(2);
        }
        C0313e c0313e = this.f22547e.startapp;
        C0313e c0313e2 = c0313e;
        while (c0313e2 != null && !c18208e.equals(c0313e2.billing.ad)) {
            c0313e2 = c0313e2.smaato;
        }
        if (z || c0313e != c0313e2 || (c0313e2 != null && c0313e2.Signature + j < 0)) {
            for (int i = 0; i < this.f22587e.length; i++) {
                yandex(i);
            }
            this.f22549e = -9223372036854775807L;
            if (c0313e2 != null) {
                while (true) {
                    c8757e = this.f22547e;
                    if (c8757e.startapp == c0313e2) {
                        break;
                    }
                    c8757e.ad();
                }
                c8757e.loadAd(c0313e2);
                c0313e2.Signature = 1000000000000L;
                advert(this.f22547e.adcel.appmetrica(), new boolean[this.f22587e.length]);
                c0313e2.yandex = true;
            }
        }
        billing();
        if (c0313e2 != null) {
            this.f22547e.loadAd(c0313e2);
            if (!c0313e2.appmetrica) {
                c0313e2.billing = c0313e2.billing.vip(j, -9223372036854775807L);
            } else if (c0313e2.purchase) {
                if (this.f22552e) {
                    this.f22561e.getClass();
                    if (!this.f22570e.ad.Signature() && c0313e2.billing.ad.equals(this.f22570e.vip)) {
                        long j2 = c0313e2.Signature + j;
                        boolean z4 = true;
                        for (C1167e c1167e : this.f22587e) {
                            if (c1167e.yandex()) {
                                AbstractC0241e license = c1167e.license(c0313e2);
                                z4 &= license != null && license.crashlytics(j2);
                            }
                        }
                        if (z4) {
                            ?? r10 = c0313e2.ad;
                            long j3 = this.f22570e.remoteconfig;
                            C1198e c1198e = C1198e.metrica;
                            if (r10.appmetrica(j3, c1198e) == c0313e2.ad.appmetrica(j, c1198e)) {
                                z3 = false;
                            }
                        }
                    }
                }
                j = c0313e2.ad.yandex(j);
                c0313e2.ad.startapp(j - this.f22539e);
            }
            m3138abstract(j, z3);
            subs();
        } else {
            this.f22547e.vip();
            m3138abstract(j, true);
        }
        signatures(false);
        this.f22562e.billing(2);
        return j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r7.ad == 1) goto L20;
     */
    /* renamed from: package, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3169package(defpackage.C3335e r7, boolean r8) {
        /*
            r6 = this;
            eٍُٝ r0 = r6.f22574e
            eُْٕ r0 = (defpackage.C11010e) r0
            eْٕؕ r1 = r0.f21803e
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto Ld
            goto L12
        Ld:
            r0.f21803e = r7
            r0.m2981e()
        L12:
            if (r8 == 0) goto L15
            goto L16
        L15:
            r7 = 0
        L16:
            eٖٟۨ r8 = r6.f22563e
            eْٕؕ r0 = r8.license
            boolean r0 = j$.util.Objects.equals(r0, r7)
            if (r0 != 0) goto L53
            r8.license = r7
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L28
        L26:
            r3 = r0
            goto L47
        L28:
            int r2 = r7.metrica
            r3 = 3
            r4 = 2
            java.lang.String r5 = "AudioFocusManager"
            switch(r2) {
                case 0: goto L41;
                case 1: goto L3f;
                case 2: goto L3d;
                case 3: goto L26;
                case 4: goto L3d;
                case 5: goto L47;
                case 6: goto L47;
                case 7: goto L47;
                case 8: goto L47;
                case 9: goto L47;
                case 10: goto L47;
                case 11: goto L39;
                case 12: goto L47;
                case 13: goto L47;
                case 14: goto L3f;
                case 15: goto L31;
                case 16: goto L37;
                default: goto L31;
            }
        L31:
            java.lang.String r7 = "Unidentified audio usage: "
            defpackage.AbstractC10257e.pro(r7, r2, r5)
            goto L26
        L37:
            r3 = 4
            goto L47
        L39:
            int r7 = r7.ad
            if (r7 != r1) goto L47
        L3d:
            r3 = r4
            goto L47
        L3f:
            r3 = r1
            goto L47
        L41:
            java.lang.String r7 = "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default."
            defpackage.AbstractC2803e.smaato(r5, r7)
            goto L3f
        L47:
            r8.purchase = r3
            if (r3 == r1) goto L4d
            if (r3 != 0) goto L4e
        L4d:
            r0 = r1
        L4e:
            java.lang.String r7 = "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME."
            defpackage.AbstractC2301e.yandex(r0, r7)
        L53:
            eؚۙٗ r7 = r6.f22570e
            boolean r0 = r7.advert
            int r1 = r7.amazon
            int r2 = r7.smaato
            int r7 = r7.appmetrica
            int r7 = r8.license(r7, r0)
            r6.m3158e(r7, r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.m3169package(eْٕؕ, boolean):void");
    }

    public final boolean premium() {
        C0313e c0313e = this.f22547e.startapp;
        long j = c0313e.billing.purchase;
        if (c0313e.appmetrica) {
            return j == -9223372036854775807L || this.f22570e.remoteconfig < j || !m3159e();
        }
        return false;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m3170private(C1520e c1520e) {
        Looper looper = c1520e.appmetrica;
        if (looper.getThread().isAlive()) {
            this.f22558e.ad(looper, null).license(new RunnableC2783e(this, c1520e));
        } else {
            AbstractC2803e.smaato("TAG", "Trying to send message on a dead thread.");
            c1520e.ad(false);
        }
    }

    public final void pro(int i, IOException iOException) {
        C5681e c5681e = new C5681e(0, iOException, i);
        C0313e c0313e = this.f22547e.startapp;
        if (c0313e != null) {
            c5681e = c5681e.metrica(c0313e.billing.ad);
        }
        AbstractC2803e.billing("ExoPlayerImplInternal", "Playback error", c5681e);
        m3148e(false, false);
        this.f22570e = this.f22570e.purchase(c5681e);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ca  */
    /* renamed from: protected, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3171protected(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.m3171protected(boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: public, reason: not valid java name */
    public final void m3172public(float f) {
        this.f22546e = f;
        float f2 = f * this.f22563e.billing;
        for (C1167e c1167e : this.f22587e) {
            if (c1167e.appmetrica() == 1) {
                ((AbstractC0241e) c1167e.appmetrica).ad(2, Float.valueOf(f2));
                AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.purchase;
                if (abstractC0241e != null) {
                    abstractC0241e.ad(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void purchase() {
        m3183try();
        m3160final(true);
    }

    public final void remoteconfig(InterfaceC14239e interfaceC14239e) {
        C8757e c8757e = this.f22547e;
        C0313e c0313e = c8757e.advert;
        if (c0313e != null && c0313e.ad == interfaceC14239e) {
            c8757e.amazon(this.f22551e);
            subs();
            return;
        }
        C0313e c0313e2 = c8757e.smaato;
        if (c0313e2 == null || c0313e2.ad != interfaceC14239e) {
            return;
        }
        crashlytics();
    }

    /* renamed from: return, reason: not valid java name */
    public final void m3173return(int i) {
        this.f22554e = i;
        AbstractC6690e abstractC6690e = this.f22570e.ad;
        C8757e c8757e = this.f22547e;
        c8757e.billing = i;
        int remoteconfig = c8757e.remoteconfig(abstractC6690e);
        if ((remoteconfig & 1) != 0) {
            m3160final(true);
        } else if ((remoteconfig & 2) != 0) {
            billing();
        }
        signatures(false);
    }

    public final void signatures(boolean z) {
        C0313e c0313e = this.f22547e.advert;
        C18208e c18208e = c0313e == null ? this.f22570e.vip : c0313e.billing.ad;
        boolean equals = this.f22570e.mopub.equals(c18208e);
        if (!equals) {
            this.f22570e = this.f22570e.metrica(c18208e);
        }
        C7422e c7422e = this.f22570e;
        c7422e.admob = c0313e == null ? c7422e.remoteconfig : c0313e.license();
        C7422e c7422e2 = this.f22570e;
        c7422e2.subscription = Signature(c7422e2.admob);
        if ((!equals || z) && c0313e != null && c0313e.appmetrica) {
            m3154e(c0313e.billing.ad, c0313e.loadAd);
        }
    }

    public final long smaato(AbstractC6690e abstractC6690e, Object obj, long j) {
        C6158e c6158e = this.f22540e;
        int i = abstractC6690e.billing(obj, c6158e).metrica;
        C11501e c11501e = this.f22566e;
        abstractC6690e.amazon(i, c11501e);
        if (c11501e.purchase != -9223372036854775807L && c11501e.ad() && c11501e.startapp) {
            return AbstractC9413e.m2546case(AbstractC9413e.firebase(c11501e.billing) - c11501e.purchase) - (j + c6158e.appmetrica);
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x024a, code lost:
    
        if (r6 >= r4.metrica) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e4  */
    /* JADX WARN: Type inference failed for: r4v1, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v19, types: [eٓۛٛ, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void startapp() {
        /*
            Method dump skipped, instructions count: 932
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.startapp():void");
    }

    /* renamed from: static, reason: not valid java name */
    public final void m3174static(C4194e c4194e) {
        this.f22562e.purchase(16);
        C9964e c9964e = this.f22544e;
        c9964e.Signature(c4194e);
        C4194e isVip = c9964e.isVip();
        inmobi(isVip, isVip.ad, true, true);
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final void m3175strictfp(C1520e c1520e) {
        c1520e.getClass();
        C2399e c2399e = this.f22562e;
        if (c1520e.appmetrica != this.f22542e) {
            c2399e.vip(15, c1520e).vip();
            return;
        }
        synchronized (c1520e) {
        }
        try {
            c1520e.ad.ad(c1520e.metrica, c1520e.license);
            c1520e.ad(true);
            int i = this.f22570e.appmetrica;
            if (i == 3 || i == 2) {
                c2399e.billing(2);
            }
        } catch (Throwable th) {
            c1520e.ad(true);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [eٓۛٛ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.Object, eًٔ] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, eًٔ] */
    public final void subs() {
        boolean vip;
        if (applovin(this.f22547e.advert)) {
            C0313e c0313e = this.f22547e.advert;
            long Signature = Signature(!c0313e.appmetrica ? 0L : c0313e.ad.license());
            C0313e c0313e2 = this.f22547e.startapp;
            long j = m3153e(this.f22570e.ad, c0313e.billing.ad) ? this.f22592e.yandex : -9223372036854775807L;
            C5350e c5350e = this.f22568e;
            AbstractC6690e abstractC6690e = this.f22570e.ad;
            C18208e c18208e = c0313e.billing.ad;
            float f = this.f22544e.isVip().ad;
            boolean z = this.f22570e.advert;
            C7466e c7466e = new C7466e(c5350e, abstractC6690e, c18208e, Signature, f, this.f22538e, j);
            vip = ((C2734e) this.f22591e).vip(c7466e);
            C0313e c0313e3 = this.f22547e.startapp;
            if (!vip && c0313e3.appmetrica && Signature < 500000 && this.f22539e > 0) {
                c0313e3.ad.startapp(this.f22570e.remoteconfig);
                vip = ((C2734e) this.f22591e).vip(c7466e);
            }
        } else {
            vip = false;
        }
        this.f22560e = vip;
        if (vip) {
            C0313e c0313e4 = this.f22547e.advert;
            c0313e4.getClass();
            C4042e c4042e = new C4042e();
            c4042e.ad = this.f22551e - c0313e4.Signature;
            float f2 = this.f22544e.isVip().ad;
            AbstractC2301e.billing(f2 > 0.0f || f2 == -3.4028235E38f);
            c4042e.vip = f2;
            long j2 = this.f22548e;
            AbstractC2301e.billing(j2 >= 0 || j2 == -9223372036854775807L);
            c4042e.metrica = j2;
            C6576e c6576e = new C6576e(c4042e);
            AbstractC2301e.subscription(c0313e4.smaato == null);
            c0313e4.ad.loadAd(c6576e);
        }
        m3149e();
    }

    public final void subscription() {
        m3172public(this.f22546e);
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [eٓۛٛ, java.lang.Object] */
    /* renamed from: super, reason: not valid java name */
    public final void m3176super(C11573e c11573e) {
        long longValue;
        C18208e admob;
        long j;
        long j2;
        boolean z;
        long j3;
        boolean z2;
        C18208e c18208e;
        long j4;
        long j5;
        long j6;
        C7422e c7422e;
        int i;
        long j7;
        C18208e c18208e2;
        int i2;
        long j8;
        boolean z3;
        long m3168new;
        C7422e c7422e2;
        C18208e c18208e3;
        AbstractC6690e abstractC6690e;
        long j9;
        C11246e c11246e = this;
        if (c11246e.f22569e) {
            if (c11246e.f22550e != null) {
                c11246e.f22573e++;
                c11246e.f22557e.purchase(1);
            }
            c11246e.f22550e = c11573e;
            return;
        }
        c11246e.f22557e.purchase(1);
        Pair m3137implements = m3137implements(c11246e.f22570e.ad, c11573e, true, c11246e.f22554e, c11246e.f22586e, c11246e.f22566e, c11246e.f22540e);
        if (m3137implements == null) {
            Pair loadAd = c11246e.loadAd(c11246e.f22570e.ad);
            admob = (C18208e) loadAd.first;
            longValue = ((Long) loadAd.second).longValue();
            z = !c11246e.f22570e.ad.Signature();
            j = -9223372036854775807L;
            j2 = 0;
            j3 = -9223372036854775807L;
        } else {
            Object obj = m3137implements.first;
            longValue = ((Long) m3137implements.second).longValue();
            long j10 = c11573e.metrica == -9223372036854775807L ? -9223372036854775807L : longValue;
            admob = c11246e.f22547e.admob(c11246e.f22570e.ad, obj, longValue);
            if (admob.vip()) {
                c11246e.f22570e.ad.billing(admob.ad, c11246e.f22540e);
                longValue = c11246e.f22540e.purchase(admob.vip) == admob.metrica ? c11246e.f22540e.billing.vip : 0L;
                C11768e ad = c11246e.f22540e.billing.ad(admob.vip);
                j2 = 0;
                j = -9223372036854775807L;
                j10 = Math.max(j10, ad.ad + ad.adcel);
            } else {
                j = -9223372036854775807L;
                j2 = 0;
                if (c11573e.metrica != -9223372036854775807L) {
                    z = false;
                    j3 = j10;
                }
            }
            z = true;
            j3 = j10;
        }
        try {
            if (c11246e.f22570e.ad.Signature()) {
                c11246e.f22559e = c11573e;
            } else if (m3137implements == null) {
                if (c11246e.f22570e.appmetrica != 1) {
                    c11246e.m3184volatile(4);
                }
                c11246e.m3171protected(false, true, false, true);
            } else {
                try {
                    try {
                        try {
                            try {
                                if (admob.equals(c11246e.f22570e.vip)) {
                                    try {
                                        C0313e c0313e = c11246e.f22547e.startapp;
                                        if (c0313e == null || !c0313e.appmetrica || longValue == j2) {
                                            j5 = longValue;
                                        } else {
                                            ?? r0 = c0313e.ad;
                                            long j11 = c11246e.f22566e.smaato;
                                            if (c11246e.f22552e && j11 != j) {
                                                c11246e.f22561e.getClass();
                                            }
                                            j5 = r0.appmetrica(longValue, c11246e.f22571e);
                                        }
                                        if (AbstractC9413e.m2567switch(j5) != AbstractC9413e.m2567switch(c11246e.f22570e.remoteconfig) || ((i = (c7422e = c11246e.f22570e).appmetrica) != 2 && i != 3)) {
                                            z2 = z;
                                            j6 = j3;
                                            c18208e = admob;
                                        }
                                        j7 = c7422e.remoteconfig;
                                        z2 = z;
                                        c18208e2 = admob;
                                        i2 = 2;
                                        j8 = j7;
                                        c11246e.f22570e = c11246e.isPro(c18208e2, j7, j3, j8, z2, i2);
                                    } catch (Throwable th) {
                                        th = th;
                                        z2 = z;
                                        c18208e = admob;
                                        j4 = longValue;
                                        c11246e.f22570e = c11246e.isPro(c18208e, j4, j3, j4, z2, 2);
                                        throw th;
                                    }
                                }
                                z2 = z;
                                j6 = j3;
                                c18208e = admob;
                                j5 = longValue;
                                c11246e.m3152e(abstractC6690e, c18208e3, abstractC6690e, c7422e2.vip, j9, true);
                                c18208e2 = c18208e3;
                                j3 = j9;
                                j7 = m3168new;
                                i2 = 2;
                                j8 = j7;
                                c11246e = this;
                                c11246e.f22570e = c11246e.isPro(c18208e2, j7, j3, j8, z2, i2);
                            } catch (Throwable th2) {
                                th = th2;
                                c18208e = c18208e3;
                                j3 = j9;
                                j4 = m3168new;
                                c11246e.f22570e = c11246e.isPro(c18208e, j4, j3, j4, z2, 2);
                                throw th;
                            }
                            abstractC6690e = c7422e2.ad;
                            j9 = j6;
                        } catch (Throwable th3) {
                            th = th3;
                            c18208e = c18208e3;
                            j3 = j6;
                            j4 = m3168new;
                            c11246e.f22570e = c11246e.isPro(c18208e, j4, j3, j4, z2, 2);
                            throw th;
                        }
                        c7422e2 = c11246e.f22570e;
                        c18208e3 = c18208e;
                    } catch (Throwable th4) {
                        th = th4;
                    }
                    if (c11246e.f22552e) {
                        try {
                            for (C1167e c1167e : c11246e.f22587e) {
                                if (c1167e.yandex() && c1167e.appmetrica() == 2) {
                                    z3 = true;
                                    c11246e.f22569e = true;
                                    break;
                                }
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j4 = longValue;
                            j3 = j6;
                            c11246e.f22570e = c11246e.isPro(c18208e, j4, j3, j4, z2, 2);
                            throw th;
                        }
                    }
                    z3 = true;
                    boolean z4 = c11246e.f22570e.appmetrica == 4 ? z3 : false;
                    C8757e c8757e = c11246e.f22547e;
                    m3168new = c11246e.m3168new(c18208e, j5, c8757e.startapp != c8757e.adcel ? z3 : false, z4);
                    z2 |= longValue != m3168new ? z3 : false;
                } catch (Throwable th6) {
                    th = th6;
                    j3 = j6;
                    j4 = longValue;
                    c11246e.f22570e = c11246e.isPro(c18208e, j4, j3, j4, z2, 2);
                    throw th;
                }
            }
            z2 = z;
            c18208e2 = admob;
            j7 = longValue;
            i2 = 2;
            j8 = j7;
            c11246e = this;
            c11246e.f22570e = c11246e.isPro(c18208e2, j7, j3, j8, z2, i2);
        } catch (Throwable th7) {
            th = th7;
            z2 = z;
        }
    }

    /* renamed from: switch, reason: not valid java name */
    public final void m3177switch(C17615e c17615e) {
        this.f22561e = c17615e;
        license();
    }

    /* renamed from: synchronized, reason: not valid java name */
    public final void m3178synchronized(C4610e c4610e) {
        this.f22565e = c4610e;
        AbstractC6690e abstractC6690e = this.f22570e.ad;
        C8757e c8757e = this.f22547e;
        c8757e.getClass();
        c4610e.getClass();
        if (c8757e.admob.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < c8757e.admob.size(); i++) {
            ((C0313e) c8757e.admob.get(i)).startapp();
        }
        c8757e.admob = arrayList;
        c8757e.smaato = null;
        c8757e.advert();
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x029b, code lost:
    
        if ((r13 + r9) <= r11) goto L125;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04ae  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x048f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03cd A[Catch: all -> 0x03c8, TryCatch #2 {all -> 0x03c8, blocks: (B:127:0x03c4, B:128:0x03cd, B:130:0x03d3, B:43:0x03e2, B:65:0x03e9, B:67:0x03ef, B:69:0x03f9, B:71:0x0406, B:74:0x0409), top: B:41:0x038f }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0315 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x044e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0450  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x04d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void tapsense(defpackage.AbstractC6690e r46, boolean r47) {
        /*
            Method dump skipped, instructions count: 1249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.tapsense(eؙ۠ؐ, boolean):void");
    }

    /* renamed from: this, reason: not valid java name */
    public final void m3179this(C4506e c4506e) {
        AbstractC6690e metrica;
        this.f22557e.purchase(1);
        int i = c4506e.ad;
        int i2 = c4506e.vip;
        int i3 = c4506e.metrica;
        C2166e c2166e = c4506e.license;
        C7982e c7982e = this.f22572e;
        ArrayList arrayList = (ArrayList) c7982e.metrica;
        AbstractC2301e.billing(i >= 0 && i <= i2 && i2 <= arrayList.size() && i3 >= 0);
        c7982e.mopub = c2166e;
        if (i == i2 || i == i3) {
            metrica = c7982e.metrica();
        } else {
            int min = Math.min(i, i3);
            int max = Math.max(((i2 - i) + i3) - 1, i2 - 1);
            int i4 = ((C8846e) arrayList.get(min)).license;
            AbstractC9413e.m2554implements(arrayList, i, i2, i3);
            while (min <= max) {
                C8846e c8846e = (C8846e) arrayList.get(min);
                c8846e.license = i4;
                i4 += c8846e.ad.loadAd.appmetrica.loadAd();
                min++;
            }
            metrica = c7982e.metrica();
        }
        tapsense(metrica, false);
    }

    /* renamed from: throw, reason: not valid java name */
    public final void m3180throw() {
        for (int i = 0; i < this.f22587e.length; i++) {
            AbstractC0241e abstractC0241e = this.f22553e[i];
            synchronized (abstractC0241e.f1504e) {
                abstractC0241e.f1495e = null;
            }
            C1167e c1167e = this.f22587e[i];
            AbstractC0241e abstractC0241e2 = (AbstractC0241e) c1167e.appmetrica;
            AbstractC2301e.subscription(abstractC0241e2.f1500e == 0);
            abstractC0241e2.smaato();
            c1167e.ad = false;
            AbstractC0241e abstractC0241e3 = (AbstractC0241e) c1167e.purchase;
            if (abstractC0241e3 != null) {
                AbstractC2301e.subscription(abstractC0241e3.f1500e == 0);
                abstractC0241e3.smaato();
                c1167e.vip = false;
            }
        }
    }

    /* renamed from: throws, reason: not valid java name */
    public final void m3181throws(C1198e c1198e) {
        this.f22571e = c1198e;
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m3182transient(boolean z, C12594e c12594e) {
        if (this.f22576e != z) {
            this.f22576e = z;
            if (!z) {
                for (C1167e c1167e : this.f22587e) {
                    c1167e.advert();
                }
            }
        }
        if (c12594e != null) {
            c12594e.license();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* renamed from: try, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3183try() {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C11246e.m3183try():void");
    }

    @Override // defpackage.InterfaceC17077e
    public final void vip(long j, long j2, C16975e c16975e, MediaFormat mediaFormat) {
        if (this.f22569e) {
            this.f22562e.ad(37).vip();
        }
    }

    /* renamed from: volatile, reason: not valid java name */
    public final void m3184volatile(int i) {
        C7422e c7422e = this.f22570e;
        if (c7422e.appmetrica != i) {
            if (i != 2) {
                this.f22577e = -9223372036854775807L;
            }
            if (i != 3 && c7422e.Signature) {
                this.f22570e = c7422e.startapp(false);
            }
            this.f22570e = this.f22570e.yandex(i);
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final void m3185while(int i, int i2, C2166e c2166e) {
        this.f22557e.purchase(1);
        C7982e c7982e = this.f22572e;
        c7982e.getClass();
        AbstractC2301e.billing(i >= 0 && i <= i2 && i2 <= ((ArrayList) c7982e.metrica).size());
        c7982e.mopub = c2166e;
        c7982e.startapp(i, i2);
        tapsense(c7982e.metrica(), false);
    }

    public final void yandex(int i) {
        C1167e[] c1167eArr = this.f22587e;
        int metrica = c1167eArr[i].metrica();
        C1167e c1167e = c1167eArr[i];
        AbstractC0241e abstractC0241e = (AbstractC0241e) c1167e.appmetrica;
        C9964e c9964e = this.f22544e;
        c1167e.ad(abstractC0241e, c9964e);
        AbstractC0241e abstractC0241e2 = (AbstractC0241e) c1167e.purchase;
        if (abstractC0241e2 != null) {
            boolean z = C1167e.startapp(abstractC0241e2) && c1167e.license != 3;
            c1167e.ad(abstractC0241e2, c9964e);
            c1167e.adcel(false);
            if (z) {
                AbstractC0241e abstractC0241e3 = (AbstractC0241e) c1167e.appmetrica;
                abstractC0241e2.getClass();
                abstractC0241e2.ad(17, abstractC0241e3);
            }
        }
        c1167e.license = 0;
        m3166interface(i, false);
        this.f22575e -= metrica;
    }
}
