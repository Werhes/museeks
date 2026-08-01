package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Parcel;
import android.view.Display;
import com.google.firebase.components.ComponentRegistrar;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.functions.Function3;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؗۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5107e implements InterfaceC9274e, InterfaceC1598e, InterfaceC0774e, InterfaceC2726e, InterfaceC11962e, InterfaceC17847e, InterfaceC4871e, InterfaceC1481e, InterfaceC4529e, InterfaceC7113e, InterfaceC8292e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C5107e f10957e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f10974e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C5107e f10952e = new C5107e(1);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C5107e f10967e = new C5107e(2);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C5107e f10949e = new C5107e(3);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C5107e f10972e = new C5107e(4);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C5107e f10971e = new C5107e(6);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C16372e f10961e = new C16372e("PackageViewDescriptorFactory", 2);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C5107e f10969e = new C5107e(8);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C16658e f10953e = new C16658e(0);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C16658e f10963e = new C16658e(1);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C16658e f10951e = new C16658e(2);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C16658e f10950e = new C16658e(3);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C16658e f10955e = new C16658e(4);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C5107e f10959e = new C5107e(10);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C5107e f10960e = new C5107e(11);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C5107e f10958e = new C5107e(12);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C5107e f10956e = new C5107e(13);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C5107e f10966e = new C5107e(14);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C5107e f10973e = new C5107e(15);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final /* synthetic */ C5107e f10954e = new C5107e(16);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C5107e f10965e = new C5107e(17);

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final /* synthetic */ C5107e f10968e = new C5107e(18);

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final C5107e f10970e = new C5107e(19);

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final C5107e f10964e = new C5107e(20);

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final C5107e f10962e = new C5107e(21);

    public /* synthetic */ C5107e(int i) {
        this.f10974e = i;
    }

    public static String mopub(AbstractC17308e abstractC17308e) {
        String metrica;
        if (abstractC17308e instanceof C5885e) {
            return "[" + mopub(((C5885e) abstractC17308e).startapp);
        }
        if (abstractC17308e instanceof C12250e) {
            EnumC8790e enumC8790e = ((C12250e) abstractC17308e).startapp;
            return (enumC8790e == null || (metrica = enumC8790e.metrica()) == null) ? "V" : metrica;
        }
        if (abstractC17308e instanceof C15381e) {
            return AbstractC4653e.applovin(new StringBuilder("L"), ((C15381e) abstractC17308e).startapp, ';');
        }
        throw new C14803e(10);
    }

    public static synchronized void smaato() {
        synchronized (C5107e.class) {
            if (f10957e == null) {
                f10957e = new C5107e(0);
            }
        }
    }

    public static AbstractC17308e vip(String str) {
        EnumC8790e enumC8790e;
        char charAt = str.charAt(0);
        EnumC8790e[] values = EnumC8790e.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                enumC8790e = null;
                break;
            }
            enumC8790e = values[i];
            if (enumC8790e.metrica().charAt(0) == charAt) {
                break;
            }
            i++;
        }
        if (enumC8790e != null) {
            return new C12250e(enumC8790e);
        }
        if (charAt == 'V') {
            return new C12250e(null);
        }
        if (charAt == '[') {
            return new C5885e(vip(str.substring(1)));
        }
        if (charAt == 'L') {
            AbstractC5304e.premium(str, ';');
        }
        return new C15381e(AbstractC5087e.m1752this(1, 1, str));
    }

    public static boolean yandex(AudioTrack audioTrack) {
        int i = audioTrack.vip;
        long j = audioTrack.metrica;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        sb.append('_');
        sb.append(i);
        String sb2 = sb.toString();
        C4199e m4502e = C18353e.vip.m4502e();
        CachedTrack cachedTrack = m4502e != null ? (CachedTrack) AbstractC18366e.metrica(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "uid == $0", Arrays.copyOf(new Object[]{sb2}, 1))) : null;
        if (cachedTrack != null) {
            return cachedTrack.crashlytics();
        }
        return false;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C11125e c11125e = (C11125e) ((C7971e) obj).loadAd();
        Parcel m4156e = c11125e.m4156e();
        int i = AbstractC0923e.ad;
        m4156e.writeInt(1);
        AbstractC16852e.ads(m4156e, AbstractC16852e.applovin(m4156e, 20293));
        c11125e.m4153e(m4156e, 2002);
        ((C8988e) obj2).vip(Boolean.TRUE);
    }

    @Override // defpackage.InterfaceC7113e
    public List ad(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (C7259e c7259e : componentRegistrar.getComponents()) {
            String str = c7259e.ad;
            if (str != null) {
                c7259e = new C7259e(str, c7259e.vip, c7259e.metrica, c7259e.license, c7259e.appmetrica, new C11565e(str, c7259e, 4), c7259e.billing);
            }
            arrayList.add(c7259e);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object adcel(java.util.List r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C4028e
            if (r0 == 0) goto L13
            r0 = r6
            eُؖؑ r0 = (defpackage.C4028e) r0
            int r1 = r0.f8956e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8956e = r1
            goto L18
        L13:
            eُؖؑ r0 = new eُؖؑ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f8954e
            int r1 = r0.f8956e
            r2 = 1
            if (r1 == 0) goto L2f
            if (r1 != r2) goto L27
            java.util.List r5 = r0.f8955e
            defpackage.AbstractC2003e.purchase(r6)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            defpackage.AbstractC2003e.purchase(r6)
            eًۚ r6 = defpackage.C18353e.ad
            r0.f8955e = r5
            r0.f8956e = r2
            eۣۡ r6 = defpackage.C18353e.vip
            java.lang.Object r6 = r6.m4501e(r0)
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r6 != r0) goto L43
            return r0
        L43:
            eّؖٚ r6 = (defpackage.C4199e) r6
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r1 = 0
            r0[r1] = r5
            java.lang.Class<ua.itaysonlab.vkxreborn.cache.realm.CachedTrack> r1 = ua.itaysonlab.vkxreborn.cache.realm.CachedTrack.class
            eؙّؔ r3 = defpackage.AbstractC3820e.ad
            eؚ٘ٚ r1 = r3.vip(r1)
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            java.lang.String r2 = "uid IN $0"
            eٓٛۘ r6 = r6.m1506e(r1, r2, r0)
            eؙؓٔ r6 = r6.metrica()
            eٌؚؕ r0 = new eٌؚؕ
            r1 = 2
            r0.<init>(r1, r5)
            java.util.List r5 = defpackage.AbstractC13480e.m3577else(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5107e.adcel(java.util.List, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e advert(InterfaceC7227e interfaceC7227e, C8229e c8229e) {
        return billing(((InterfaceC18155e) interfaceC7227e).subs(), c8229e);
    }

    @Override // defpackage.InterfaceC4871e
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.InterfaceC8292e
    public Object appmetrica(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e billing(Class cls, C8229e c8229e) {
        return new C3463e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        C3079e c3079e = new C3079e("BeforeReceive");
        C13886e c13886e = c9398e.f18712e;
        c13886e.adcel(C13886e.f27531e, c3079e);
        c13886e.mopub(c3079e, new C8265e((Function3) abstractC7185e, null, 1));
    }

    @Override // defpackage.InterfaceC9274e
    public Rect isVip(Activity activity) {
        int i;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i2 = point.x;
        if (i2 == 0 || (i = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i2;
        rect.bottom = i;
        return rect;
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e license(Class cls) {
        return new C3463e();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00de A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x0025, B:12:0x00d3, B:14:0x00de, B:17:0x00e4, B:18:0x00eb, B:22:0x003c, B:24:0x0048, B:26:0x0052, B:28:0x0062, B:30:0x0068, B:32:0x006e, B:34:0x008c, B:39:0x00ec, B:40:0x00f3, B:41:0x00f4, B:42:0x00fb), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4 A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x0025, B:12:0x00d3, B:14:0x00de, B:17:0x00e4, B:18:0x00eb, B:22:0x003c, B:24:0x0048, B:26:0x0052, B:28:0x0062, B:30:0x0068, B:32:0x006e, B:34:0x008c, B:39:0x00ec, B:40:0x00f3, B:41:0x00f4, B:42:0x00fb), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object metrica(defpackage.C6399e r8, defpackage.AbstractC10731e r9) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5107e.metrica(eٌؙٔ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC4529e
    public C8650e purchase(C2257e c2257e, C11058e c11058e) {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0052 A[LOOP:0: B:11:0x004c->B:13:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable startapp(java.util.List r5, defpackage.AbstractC10731e r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.C9522e
            if (r0 == 0) goto L13
            r0 = r6
            eٍٗۨ r0 = (defpackage.C9522e) r0
            int r1 = r0.f18882e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18882e = r1
            goto L18
        L13:
            eٍٗۨ r0 = new eٍٗۨ
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f18881e
            int r1 = r0.f18882e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r6)
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r6)
            r0.f18882e = r2
            java.lang.Object r6 = r4.adcel(r5, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r6 != r5) goto L3b
            return r5
        L3b:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r5 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.AbstractC0746e.subscription(r6, r0)
            r5.<init>(r0)
            java.util.Iterator r6 = r6.iterator()
        L4c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L60
            java.lang.Object r0 = r6.next()
            ua.itaysonlab.vkxreborn.cache.realm.CachedTrack r0 = (ua.itaysonlab.vkxreborn.cache.realm.CachedTrack) r0
            ua.itaysonlab.vkapi2.objects.music.AudioTrack r0 = r0.metrica()
            r5.add(r0)
            goto L4c
        L60:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5107e.startapp(java.util.List, eُؑ۠):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5107e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    public String toString() {
        switch (this.f10974e) {
            case 3:
                return "{}";
            default:
                return super.toString();
        }
    }
}
