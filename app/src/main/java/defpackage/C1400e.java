package defpackage;

import android.content.Context;
import android.media.MediaDrmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؒۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1400e implements InterfaceC0774e, InterfaceC3665e, InterfaceC5808e, InterfaceC12163e, InterfaceC11962e, InterfaceC12937e, InterfaceC1323e, InterfaceC13969e, InterfaceC8296e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4217e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C1400e f4204e = new C1400e(1);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C1400e f4199e = new C1400e(2);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C1400e f4212e = new C1400e(3);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C1400e f4196e = new C1400e(4);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C1400e f4215e = new C1400e(5);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final C1400e f4214e = new C1400e(6);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final C1400e f4208e = new C1400e(7);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final C1400e f4213e = new C1400e(8);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final C1400e f4200e = new C1400e(10);

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final C1400e f4209e = new C1400e(11);

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final C2864e f4198e = new C2864e(3);

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final C1400e f4197e = new C1400e(13);

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final C1400e f4202e = new C1400e(14);

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final C1400e f4206e = new C1400e(15);

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final C9523e f4207e = new Object();

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final C1400e f4205e = new C1400e(17);

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final C1400e f4203e = new C1400e(18);

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final C1400e f4211e = new C1400e(19);

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final C1400e f4216e = new C1400e(20);

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final C1400e f4201e = new C1400e(21);

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final C1400e f4210e = new C1400e(22);

    public /* synthetic */ C1400e(int i) {
        this.f4217e = i;
    }

    public static void ads(String str, StringBuilder sb) {
        sb.append(AbstractC10681e.billing(C0520e.appmetrica(str)));
    }

    public static void applovin(StringBuilder sb, InterfaceC15954e interfaceC15954e) {
        List parameters = interfaceC15954e.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((C2299e) ((InterfaceC8960e) obj)).f5813e == 2) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        AbstractC13480e.m3610while(arrayList, sb, null, "context(", ") ", C8865e.f17821e, 50);
    }

    /* renamed from: class, reason: not valid java name */
    public static String m597class(InterfaceC13984e interfaceC13984e, boolean z) {
        C13579e c13579e;
        AbstractC8761e abstractC8761e = (AbstractC8761e) interfaceC13984e;
        if (abstractC8761e.isPro()) {
            return m597class(abstractC8761e.crashlytics(), true);
        }
        AbstractC8761e crashlytics = abstractC8761e.crashlytics();
        AbstractC8761e mo2502interface = abstractC8761e.mo2502interface();
        if (crashlytics != null && mo2502interface != null) {
            String m597class = m597class(crashlytics, false);
            String m597class2 = m597class(mo2502interface, false);
            if (AbstractC7890e.billing(m597class, AbstractC6507e.subscription(m597class2, "?", BuildConfig.FLAVOR, false))) {
                return AbstractC6507e.subscription(m597class2, "?", "!", false);
            }
            if (AbstractC6507e.amazon(m597class2, "?", false)) {
                if (AbstractC7890e.billing(m597class + '?', m597class2)) {
                    return m597class + '!';
                }
            }
            if (AbstractC7890e.billing("(" + m597class + ")?", m597class2)) {
                return AbstractC5087e.m1746extends("(", m597class, ")!");
            }
            String yandex = AbstractC10681e.yandex(m597class, m597class2, new C11639e(m597class, 4), new C11639e(m597class, 5), C8865e.f17816e);
            if (yandex != null) {
                return yandex;
            }
            return "(" + m597class + ".." + m597class2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        InterfaceC13984e adcel = abstractC8761e.adcel();
        if (adcel != null) {
            sb.append(adcel);
            sb.append(" /* = ");
        }
        InterfaceC0861e isVip = interfaceC13984e.isVip();
        if (isVip instanceof InterfaceC12635e) {
            ads(((InterfaceC12635e) isVip).getName(), sb);
            if (interfaceC13984e.startapp()) {
                sb.append("?");
            } else if (abstractC8761e.amazon()) {
                sb.append(" & Any");
            }
        } else if (isVip instanceof InterfaceC7227e) {
            InterfaceC7227e interfaceC7227e = (InterfaceC7227e) isVip;
            if (abstractC8761e.admob()) {
                c13579e = AbstractC0206e.vip;
            } else {
                InterfaceC7227e advert = abstractC8761e.advert();
                if (advert == null) {
                    advert = interfaceC7227e;
                }
                String license = advert.license();
                c13579e = license != null ? new C13579e(license) : null;
            }
            if (c13579e == null) {
                c13579e = new C13579e(((C8404e) interfaceC7227e).f17185e.getName());
            }
            if (c13579e.yandex(AbstractC4972e.adcel) && AbstractC7890e.billing(AbstractC16155e.startapp(c13579e), C7692e.metrica) && !interfaceC13984e.signatures().contains(C5538e.metrica)) {
                if (abstractC8761e.startapp()) {
                    sb.append("(");
                }
                if (abstractC8761e.subs()) {
                    sb.append("suspend ");
                }
                AbstractC13480e.m3610while(AbstractC13480e.crashlytics(abstractC8761e.signatures()), sb, null, "(", ") -> ", null, 114);
                sb.append(AbstractC13480e.m3570break(abstractC8761e.signatures()));
                if (abstractC8761e.startapp()) {
                    sb.append(")?");
                }
            } else {
                firebase(sb, interfaceC7227e, c13579e, interfaceC13984e.signatures(), interfaceC13984e.startapp(), z);
            }
        } else if (isVip instanceof C13967e) {
            C13579e c13579e2 = ((C13967e) isVip).f27688e.ad;
            c13579e2.getClass();
            AbstractC13480e.m3610while(C13579e.purchase(c13579e2), sb, ".", null, null, C8865e.f17811e, 60);
            sb = sb;
            m598goto(sb, interfaceC13984e.signatures(), interfaceC13984e.startapp(), z);
        } else {
            sb.append("???");
        }
        if (abstractC8761e.adcel() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static void firebase(StringBuilder sb, InterfaceC7227e interfaceC7227e, C13579e c13579e, List list, boolean z, boolean z2) {
        StringBuilder sb2;
        boolean z3;
        if (interfaceC7227e.getTypeParameters().size() < list.size()) {
            InterfaceC18155e interfaceC18155e = (InterfaceC18155e) interfaceC7227e;
            if (interfaceC18155e.subs().getDeclaringClass() != null) {
                sb2 = sb;
                z3 = z2;
                firebase(sb2, AbstractC3820e.ad.vip(interfaceC18155e.subs().getDeclaringClass()), c13579e.appmetrica(), AbstractC13480e.subs(interfaceC7227e.getTypeParameters().size(), list), false, z3);
                sb2.append(".");
                sb2.append(AbstractC10681e.billing(c13579e.billing()));
                m598goto(sb2, AbstractC13480e.m3602switch(list, interfaceC7227e.getTypeParameters().size()), z, z3);
            }
        }
        sb2 = sb;
        z3 = z2;
        sb2.append(AbstractC10681e.startapp(C13579e.purchase(c13579e)));
        m598goto(sb2, AbstractC13480e.m3602switch(list, interfaceC7227e.getTypeParameters().size()), z, z3);
    }

    /* renamed from: goto, reason: not valid java name */
    public static void m598goto(StringBuilder sb, List list, boolean z, boolean z2) {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            AbstractC13480e.m3610while(list, sb2, null, "<", ">", new C18438e(z2), 50);
        }
        if (z) {
            sb2.append("?");
        }
    }

    public static void premium(StringBuilder sb, InterfaceC15954e interfaceC15954e) {
        List list = (List) ((AbstractC12141e) ((InterfaceC8826e) interfaceC15954e)).f24426e.invoke();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            int i = ((C2299e) ((InterfaceC8960e) obj)).f5813e;
            if (i == 1 || i == 3) {
                arrayList.add(obj);
            }
        }
        InterfaceC8960e interfaceC8960e = (InterfaceC8960e) AbstractC13480e.m3592native(0, arrayList);
        if (interfaceC8960e != null) {
            sb.append(m597class(((C2299e) interfaceC8960e).advert(), false));
            sb.append(".");
        }
        InterfaceC8960e interfaceC8960e2 = (InterfaceC8960e) AbstractC13480e.m3592native(1, arrayList);
        if (interfaceC8960e2 != null) {
            sb.append("(");
            sb.append(m597class(((C2299e) interfaceC8960e2).advert(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    @Override // defpackage.InterfaceC12163e
    public Object Signature(C13840e c13840e, Object obj) {
        char c;
        char c2;
        char c3;
        int i;
        List list;
        C12380e c12380e = (C12380e) obj;
        String obj2 = c12380e.vip().f33322e.toString();
        long j = c12380e.vip().f33324e;
        int i2 = C12347e.metrica;
        Integer valueOf = Integer.valueOf((int) (j >> 32));
        Integer valueOf2 = Integer.valueOf((int) (c12380e.vip().f33324e & 4294967295L));
        C3168e c3168e = c12380e.ad;
        C12569e c12569e = (C12569e) ((C0576e) c3168e.f7272e).getValue();
        if (c12569e != null) {
            Integer valueOf3 = Integer.valueOf(c12569e.ad);
            String str = c12569e.vip;
            String str2 = c12569e.metrica;
            long j2 = c12569e.license;
            int i3 = C12347e.metrica;
            c = 1;
            c2 = 0;
            Integer valueOf4 = Integer.valueOf((int) (j2 >> 32));
            Integer valueOf5 = Integer.valueOf((int) (j2 & 4294967295L));
            long j3 = c12569e.appmetrica;
            i = 4;
            c3 = 3;
            list = AbstractC6874e.startapp(valueOf3, str, str2, valueOf4, valueOf5, Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), Long.valueOf(c12569e.purchase));
        } else {
            c = 1;
            c2 = 0;
            c3 = 3;
            i = 4;
            list = null;
        }
        Object Signature = AbstractC16136e.f31719e.Signature(c13840e, (C16675e) c3168e.f7271e);
        Object[] objArr = new Object[2];
        objArr[c2] = list;
        objArr[c] = Signature;
        List startapp = AbstractC6874e.startapp(objArr);
        Object[] objArr2 = new Object[i];
        objArr2[c2] = obj2;
        objArr2[c] = valueOf;
        objArr2[2] = valueOf2;
        objArr2[c3] = startapp;
        return AbstractC6874e.startapp(objArr2);
    }

    @Override // defpackage.InterfaceC13969e, defpackage.InterfaceC1182e
    public AbstractC1186e ad() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.InterfaceC8296e
    public C18053e adcel() {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC1323e
    public InterfaceC9815e admob(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!cls2.getSimpleName().equals("OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError(AbstractC0054e.subs(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new C16077e(cls2);
    }

    @Override // defpackage.InterfaceC8296e
    public byte[] advert() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override // defpackage.InterfaceC3665e
    public InterfaceC1108e amazon() {
        InterfaceC1108e signatures;
        C4199e m4502e = C18353e.vip.m4502e();
        return (m4502e == null || (signatures = AbstractC0054e.signatures(m4502e.m1506e(AbstractC3820e.ad.vip(CachedTrack.class), "TRUEPREDICATE", Arrays.copyOf(new Object[0], 0)).vip("uid", new String[0]))) == null) ? new C10250e(4, C10327e.f20377e) : new C5786e(signatures, 14);
    }

    @Override // defpackage.InterfaceC3665e
    public /* bridge */ /* synthetic */ C6571e appmetrica() {
        return null;
    }

    @Override // defpackage.InterfaceC3665e
    public String billing(Context context) {
        return context.getString(R.string.fake_catalog_tracks_all);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:29|30|(2:32|27))|19|(2:23|(1:25)(1:28))|12|13))|35|6|7|(0)(0)|19|(3:21|23|(0)(0))|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0071, code lost:
    
        if (r7 != r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0074, code lost:
    
        r7.printStackTrace();
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f A[Catch: Exception -> 0x002a, TRY_LEAVE, TryCatch #0 {Exception -> 0x002a, blocks: (B:11:0x0026, B:18:0x0036, B:19:0x004c, B:21:0x0050, B:23:0x0054, B:28:0x006f, B:30:0x003d), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object crashlytics(defpackage.AbstractC1792e r7, defpackage.AbstractC10731e r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.C18526e
            if (r0 == 0) goto L13
            r0 = r8
            eۨ r0 = (defpackage.C18526e) r0
            int r1 = r0.f36323e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36323e = r1
            goto L18
        L13:
            eۨ r0 = new eۨ
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f36321e
            int r1 = r0.f36323e
            r2 = 1
            eٟؔۙ r3 = defpackage.EnumC2821e.f6782e
            r4 = 2
            if (r1 == 0) goto L3a
            if (r1 == r2) goto L34
            if (r1 != r4) goto L2c
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Exception -> L2a
            goto L77
        L2a:
            r7 = move-exception
            goto L74
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            eْؓۢ r7 = r0.f36322e
            defpackage.AbstractC2003e.purchase(r8)     // Catch: java.lang.Exception -> L2a
            goto L4c
        L3a:
            defpackage.AbstractC2003e.purchase(r8)
            eٖٕۛ r8 = r7.vip()     // Catch: java.lang.Exception -> L2a
            r0.f36322e = r7     // Catch: java.lang.Exception -> L2a
            r0.f36323e = r2     // Catch: java.lang.Exception -> L2a
            java.lang.Object r8 = r8.vip(r0)     // Catch: java.lang.Exception -> L2a
            if (r8 != r3) goto L4c
            goto L73
        L4c:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi r8 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetPersonalRadio$Preapi) r8     // Catch: java.lang.Exception -> L2a
            if (r8 == 0) goto L77
            bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo r8 = r8.ad     // Catch: java.lang.Exception -> L2a
            if (r8 == 0) goto L77
            eًٚۧ r1 = new eًٚۧ     // Catch: java.lang.Exception -> L2a
            r1.<init>(r7, r8)     // Catch: java.lang.Exception -> L2a
            r7 = 0
            r0.f36322e = r7     // Catch: java.lang.Exception -> L2a
            r0.f36323e = r4     // Catch: java.lang.Exception -> L2a
            eؑؕٗ r8 = defpackage.C0086e.billing     // Catch: java.lang.Exception -> L2a
            eّٕٓ r2 = defpackage.AbstractC6731e.ad     // Catch: java.lang.Exception -> L2a
            eؘۥۤ r4 = new eؘۥۤ     // Catch: java.lang.Exception -> L2a
            r5 = 1
            r4.<init>(r8, r1, r7, r5)     // Catch: java.lang.Exception -> L2a
            java.lang.Object r7 = defpackage.AbstractC5336e.advert(r2, r4, r0)     // Catch: java.lang.Exception -> L2a
            if (r7 != r3) goto L6f
            goto L71
        L6f:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE     // Catch: java.lang.Exception -> L2a
        L71:
            if (r7 != r3) goto L77
        L73:
            return r3
        L74:
            r7.printStackTrace()
        L77:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1400e.crashlytics(eْؓۢ, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC0774e
    /* renamed from: eؒۖۗ */
    public void mo400e(C9398e c9398e, AbstractC7185e abstractC7185e) {
        switch (this.f4217e) {
            case 1:
                c9398e.f18710e.mopub(C13886e.f27544e, new C11656e((Function2) abstractC7185e, null, 0));
                return;
            default:
                c9398e.f18713e.mopub(C13886e.f27520e, new C8265e((Function3) abstractC7185e, null, 3));
                return;
        }
    }

    @Override // defpackage.InterfaceC8296e
    public /* synthetic */ void inmobi(byte[] bArr, C5350e c5350e) {
    }

    @Override // defpackage.InterfaceC8296e
    public boolean isPro(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC8296e
    public int isVip() {
        return 1;
    }

    @Override // defpackage.InterfaceC1323e
    public boolean license(SSLSocket sSLSocket) {
        return AbstractC6507e.pro(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }

    @Override // defpackage.InterfaceC8296e
    public void loadAd(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC12937e
    /* renamed from: metrica */
    public boolean mo2946metrica(Class cls) {
        return AbstractC17076e.class.isAssignableFrom(cls);
    }

    @Override // defpackage.InterfaceC8296e
    public InterfaceC12935e mopub(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC8296e
    public void pro(C6325e c6325e) {
    }

    @Override // defpackage.InterfaceC8296e
    public Map purchase(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC8296e
    public void release() {
    }

    @Override // defpackage.InterfaceC8296e
    public byte[] remoteconfig(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC8296e
    public void signatures(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return AbstractC18275e.purchase((Executor) c18464e.inmobi(new C16786e(InterfaceC7549e.class, Executor.class)));
    }

    @Override // defpackage.InterfaceC12163e
    public Object startapp(Object obj) {
        List list = (List) obj;
        Object obj2 = list.get(0);
        Object obj3 = list.get(1);
        Object obj4 = list.get(2);
        Object obj5 = list.get(3);
        String str = (String) obj2;
        long metrica = AbstractC9262e.metrica(((Integer) obj3).intValue(), ((Integer) obj4).intValue());
        List list2 = (List) obj5;
        Object obj6 = list2.get(0);
        return new C12380e(str, metrica, new C3168e(obj6 != null ? (C12569e) C12569e.startapp.startapp(obj6) : null, (C16675e) AbstractC16136e.f31719e.startapp(list2.get(1))));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(13:5|6|7|(1:(1:(1:(1:(3:13|14|15)(2:17|18))(2:19|20))(5:23|24|25|26|(2:33|34)(1:31)))(2:36|37))(3:44|45|(2:47|22))|38|39|40|(2:42|22)|25|26|(1:28)|33|34))|50|6|7|(0)(0)|38|39|40|(0)|25|26|(0)|33|34) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b3, code lost:
    
        if (r12 == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
    
        if (r13.metrica(r0) == r8) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0071, code lost:
    
        r1 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r11v0, types: [eؘؒۢ] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable subs(boolean r12, defpackage.AbstractC10731e r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.C9597e
            if (r0 == 0) goto L13
            r0 = r13
            eٍٜٞ r0 = (defpackage.C9597e) r0
            int r1 = r0.f19039e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19039e = r1
            goto L18
        L13:
            eٍٜٞ r0 = new eٍٜٞ
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.f19042e
            int r1 = r0.f19039e
            eْۨٝ r2 = defpackage.C13664e.f27089e
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            eٟؔۙ r8 = defpackage.EnumC2821e.f6782e
            if (r1 == 0) goto L54
            if (r1 == r6) goto L4e
            if (r1 == r5) goto L46
            if (r1 == r4) goto L40
            if (r1 != r3) goto L38
            defpackage.AbstractC2003e.purchase(r13)
            eٖٗٗ r13 = (defpackage.C17055e) r13
            eؙۖؕ r12 = r13.ad
            goto Lb6
        L38:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L40:
            boolean r12 = r0.f19040e
            defpackage.AbstractC2003e.purchase(r13)
            goto La9
        L46:
            boolean r12 = r0.f19040e
            java.util.List r1 = r0.f19038e
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Exception -> L8c
            goto L88
        L4e:
            boolean r12 = r0.f19040e
            defpackage.AbstractC2003e.purchase(r13)     // Catch: java.lang.Exception -> L71
            goto L6b
        L54:
            defpackage.AbstractC2003e.purchase(r13)
            eًٕؑ r13 = new eًٕؑ     // Catch: java.lang.Exception -> L71
            java.lang.String r1 = "/radio/artist/profile/"
            java.lang.Class<bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi> r9 = bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi.class
            r13.<init>(r9, r1)     // Catch: java.lang.Exception -> L71
            r0.f19040e = r12     // Catch: java.lang.Exception -> L71
            r0.f19039e = r6     // Catch: java.lang.Exception -> L71
            java.lang.Object r13 = r13.vip(r0)     // Catch: java.lang.Exception -> L71
            if (r13 != r8) goto L6b
            goto Lb5
        L6b:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi r13 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioArtists$Preapi) r13     // Catch: java.lang.Exception -> L71
            java.util.List r13 = r13.ad     // Catch: java.lang.Exception -> L71
            r1 = r13
            goto L72
        L71:
            r1 = r2
        L72:
            eًٕؑ r13 = new eًٕؑ     // Catch: java.lang.Exception -> L8c
            java.lang.String r9 = "/radio/tag/profile/"
            java.lang.Class<bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi> r10 = bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi.class
            r13.<init>(r10, r9)     // Catch: java.lang.Exception -> L8c
            r0.f19038e = r1     // Catch: java.lang.Exception -> L8c
            r0.f19040e = r12     // Catch: java.lang.Exception -> L8c
            r0.f19039e = r5     // Catch: java.lang.Exception -> L8c
            java.lang.Object r13 = r13.vip(r0)     // Catch: java.lang.Exception -> L8c
            if (r13 != r8) goto L88
            goto Lb5
        L88:
            bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi r13 = (bruhcollective.itaysonlab.libvkmusic.methods.uma.GetRadioTags$Preapi) r13     // Catch: java.lang.Exception -> L8c
            java.util.List r2 = r13.ad     // Catch: java.lang.Exception -> L8c
        L8c:
            boolean r13 = r1.isEmpty()
            if (r13 == 0) goto Lb9
            boolean r13 = r2.isEmpty()
            if (r13 == 0) goto Lb9
            if (r12 != 0) goto Lb9
            eٖؔ r13 = defpackage.C15959e.ad
            r0.f19038e = r7
            r0.f19040e = r12
            r0.f19039e = r4
            java.lang.Object r13 = r13.metrica(r0)
            if (r13 != r8) goto La9
            goto Lb5
        La9:
            r0.f19038e = r7
            r0.f19040e = r12
            r0.f19039e = r3
            java.io.Serializable r12 = r11.subs(r6, r0)
            if (r12 != r8) goto Lb6
        Lb5:
            return r8
        Lb6:
            eؙۖؕ r12 = (defpackage.C6571e) r12
            return r12
        Lb9:
            eؙۖؕ r12 = new eؙۖؕ
            r12.<init>(r1, r2)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1400e.subs(boolean, eُؑ۠):java.io.Serializable");
    }

    @Override // defpackage.InterfaceC8296e
    public void subscription(byte[] bArr) {
    }

    @Override // defpackage.InterfaceC8296e
    public C17344e tapsense(byte[] bArr, List list, int i, HashMap hashMap) {
        throw new IllegalStateException();
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
    /* JADX WARN: Removed duplicated region for block: B:64:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f7  */
    @Override // defpackage.InterfaceC11962e
    /* renamed from: this, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo600this(defpackage.AbstractC16824e r11, defpackage.AbstractC10731e r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C1400e.mo600this(eؘٗٙ, eُؑ۠):java.lang.Object");
    }

    @Override // defpackage.InterfaceC12937e
    public C5166e vip(Class cls) {
        if (!AbstractC17076e.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (C5166e) AbstractC17076e.appmetrica(cls.asSubclass(AbstractC17076e.class)).smaato(3, null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e);
        }
    }

    @Override // defpackage.InterfaceC3665e
    public Object yandex(C15238e c15238e) {
        C11794e.f23667e.getClass();
        Object purchase = C11794e.purchase(c15238e);
        return purchase == EnumC2821e.f6782e ? purchase : Unit.INSTANCE;
    }
}
