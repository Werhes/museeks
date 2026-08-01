package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.security.keystore.KeyGenParameterSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javax.crypto.KeyGenerator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13062e {
    public static final C2892e ad = new C2892e(1121996006, false, new C14498e(25));

    public static final void ad(final int i, final int i2, final C12742e c12742e, final Function1 function1, final Function0 function0, final Function0 function02, final Function1 function12, final Function0 function03, final InterfaceC12864e interfaceC12864e, C13770e c13770e, final int i3) {
        int i4;
        boolean z;
        C0115e c0115e;
        int i5;
        int i6;
        C13770e c13770e2;
        C13770e c13770e3 = c13770e;
        c13770e3.m3671package(-356091971);
        int i7 = i3 | (c13770e3.license(i) ? 4 : 2) | (c13770e3.license(i2) ? 32 : 16) | (c13770e3.purchase(c12742e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e3.yandex(function1) ? 2048 : 1024) | (c13770e3.yandex(function0) ? 16384 : 8192) | (c13770e3.yandex(function02) ? 131072 : 65536) | (c13770e3.yandex(function12) ? 1048576 : 524288) | (c13770e3.yandex(function03) ? 8388608 : 4194304);
        if (c13770e3.m3673protected(i7 & 1, (38347923 & i7) != 38347922)) {
            C4789e ad2 = AbstractC14801e.ad(AbstractC16497e.metrica, C5438e.f11672e, c13770e3, 0);
            long j = c13770e3.f27286case;
            int i8 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e3.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e3, interfaceC12864e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e3.m3666import();
            if (c13770e3.f27292implements) {
                c13770e3.mopub(c7309e);
            } else {
                c13770e3.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e3, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e3, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e3, Integer.valueOf(i8), C2721e.adcel);
            AbstractC2270e.purchase(c13770e3, C2721e.mopub);
            AbstractC2270e.yandex(c13770e3, purchase, C2721e.license);
            boolean isEmpty = c12742e.isEmpty();
            C0115e c0115e2 = C0115e.f1276e;
            if (isEmpty) {
                i4 = i7;
                z = false;
                c0115e = c0115e2;
                i5 = 16;
                c13770e3.m3676strictfp(1671736975);
            } else {
                c13770e3.m3676strictfp(1673344046);
                if (1.0f <= 0.0d) {
                    AbstractC9534e.ad("invalid weight; must be greater than zero");
                }
                C5228e c5228e = new C5228e(1.0f, false);
                boolean z2 = ((i7 & 896) == 256) | ((i7 & 7168) == 2048);
                Object m3681throw = c13770e.m3681throw();
                if (z2 || m3681throw == C2987e.ad) {
                    i6 = 15;
                    m3681throw = new C10869e(c12742e, function1, i6);
                    c13770e2 = c13770e;
                    c13770e2.m3682throws(m3681throw);
                } else {
                    c13770e2 = c13770e;
                    i6 = 15;
                }
                i4 = i7;
                i5 = 16;
                c0115e = c0115e2;
                AbstractC7023e.ad(c5228e, null, null, null, null, null, false, null, (Function1) m3681throw, c13770e2, 0, 510);
                c13770e3 = c13770e2;
                AbstractC8141e.vip(AbstractC12220e.mopub(c0115e, 16), 0.0f, ((C0896e) c13770e3.adcel(AbstractC3577e.ad)).license, c13770e3, 6, 2);
                z = false;
            }
            c13770e3.Signature(z);
            int i9 = i4 >> 9;
            C13770e c13770e4 = c13770e3;
            AbstractC17331e.ad(i, i2, function02, function12, function03, AbstractC12220e.smaato(c0115e, 8, 0.0f, 2), c13770e4, (i4 & 14) | 196608 | (i4 & 112) | (i9 & 896) | (i9 & 7168) | (i9 & 57344));
            C15492e c15492e = AbstractC3577e.ad;
            AbstractC8141e.vip(AbstractC12220e.mopub(c0115e, i5), 0.0f, ((C0896e) c13770e4.adcel(c15492e)).license, c13770e4, 6, 2);
            float f = AbstractC11992e.ad;
            AbstractC16429e.ad(AbstractC12246e.ad, AbstractC9546e.license(AbstractC18007e.metrica(c0115e, 1.0f), false, null, function0, 15), null, null, AbstractC12246e.vip, null, AbstractC11992e.ad(C3618e.startapp, ((C0896e) c13770e4.adcel(c15492e)).ad, ((C0896e) c13770e4.adcel(c15492e)).vip, 0L, c13770e4, 504), 0.0f, 0.0f, c13770e, 24582, 428);
            c13770e3 = c13770e;
            c13770e3.Signature(true);
        } else {
            c13770e3.m3659default();
        }
        C2846e subscription = c13770e3.subscription();
        if (subscription != null) {
            subscription.license = new Function2(i, i2, c12742e, function1, function0, function02, function12, function03, interfaceC12864e, i3) { // from class: eٟؖٙ

                /* renamed from: eّؑؑ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f9227e;

                /* renamed from: eًؔؐ, reason: contains not printable characters */
                public final /* synthetic */ C12742e f9228e;

                /* renamed from: eؘٙؓ, reason: contains not printable characters */
                public final /* synthetic */ int f9229e;

                /* renamed from: eٌٍٚ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f9230e;

                /* renamed from: eؙِٖ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f9231e;

                /* renamed from: eّٕۜ, reason: contains not printable characters */
                public final /* synthetic */ InterfaceC12864e f9232e;

                /* renamed from: eّٖۦ, reason: contains not printable characters */
                public final /* synthetic */ int f9233e;

                /* renamed from: eؘَٗ, reason: contains not printable characters */
                public final /* synthetic */ Function1 f9234e;

                /* renamed from: eٗۚۖ, reason: contains not printable characters */
                public final /* synthetic */ Function0 f9235e;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int advert2 = AbstractC5190e.advert(100663297);
                    AbstractC13062e.ad(this.f9233e, this.f9229e, this.f9228e, this.f9231e, this.f9227e, this.f9235e, this.f9234e, this.f9230e, this.f9232e, (C13770e) obj, advert2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static void appmetrica(String str) {
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setKeySize(PSKKeyManager.MAX_KEY_LENGTH_BYTES).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build();
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
        keyGenerator.init(build);
        keyGenerator.generateKey();
    }

    public static void billing(Runnable runnable) {
        if (purchase()) {
            runnable.run();
        } else {
            AbstractC4265e.yandex("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static final InterfaceC9905e license(InterfaceC9905e interfaceC9905e, HashSet hashSet) {
        InterfaceC9905e m233catch;
        InterfaceC9905e license;
        C4590e c4590e = C4590e.f9890e;
        InterfaceC10269e mo1238const = c4590e.mo1238const(interfaceC9905e);
        if (hashSet.add(mo1238const)) {
            InterfaceC16046e remoteconfig = AbstractC0083e.remoteconfig(mo1238const);
            int i = 0;
            if (remoteconfig == null) {
                if (AbstractC0083e.subs(mo1238const)) {
                    List<InterfaceC4752e> Signature = AbstractC0083e.Signature(c4590e.mo1238const(interfaceC9905e));
                    List smaato = AbstractC0083e.smaato(interfaceC9905e);
                    ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(smaato, 10));
                    for (Object obj : smaato) {
                        int i2 = i + 1;
                        if (i < 0) {
                            AbstractC6874e.Signature();
                            throw null;
                        }
                        AbstractC1186e subscription = AbstractC0083e.subscription(c4590e, (InterfaceC0023e) obj);
                        if (subscription == null) {
                            subscription = AbstractC0083e.admob((InterfaceC4752e) Signature.get(i));
                        }
                        arrayList.add(subscription);
                        i = i2;
                    }
                    ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(Signature, 10));
                    for (InterfaceC4752e interfaceC4752e : Signature) {
                        if (!(interfaceC4752e instanceof InterfaceC16046e)) {
                            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                            sb.append(interfaceC4752e);
                            sb.append(", ");
                            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC4752e.getClass(), sb).toString());
                        }
                        arrayList2.add(((InterfaceC16046e) interfaceC4752e).mo1459goto());
                    }
                    Map mopub = AbstractC10064e.mopub(AbstractC13480e.m3579e(arrayList, arrayList2));
                    ArrayList arrayList3 = new ArrayList(mopub.size());
                    for (Map.Entry entry : mopub.entrySet()) {
                        arrayList3.add(new C6571e((InterfaceC5021e) ((InterfaceC10269e) entry.getKey()), new C7878e((AbstractC1186e) ((InterfaceC9905e) entry.getValue()))));
                    }
                    C4542e c4542e = new C4542e(new C13027e(1, AbstractC10064e.mopub(arrayList3)));
                    if (!(interfaceC9905e instanceof AbstractC1186e)) {
                        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb2.append(interfaceC9905e);
                        sb2.append(", ");
                        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb2).toString());
                    }
                    AbstractC10226e billing = AbstractC17093e.billing((AbstractC1186e) interfaceC9905e);
                    if (billing == null) {
                        m233catch = null;
                    } else {
                        InterfaceC4752e vip = vip(billing);
                        m233catch = vip == null ? AbstractC0083e.m233catch(c4542e, billing) : yandex(billing, AbstractC0083e.m233catch(c4542e, AbstractC0083e.admob(vip)));
                    }
                    if (m233catch != null && (license = license(m233catch, hashSet)) != null) {
                        if (!AbstractC0083e.m238goto(interfaceC9905e)) {
                            return license;
                        }
                        if (!AbstractC0083e.m238goto(license) && (!(license instanceof InterfaceC7557e) || !AbstractC0083e.m249this((InterfaceC7557e) license))) {
                            return c4590e.m1641final(license);
                        }
                    }
                }
                return interfaceC9905e;
            }
            InterfaceC9905e admob = AbstractC0083e.admob(remoteconfig);
            InterfaceC9905e license2 = license(admob, hashSet);
            if (license2 != null) {
                if (AbstractC0083e.subs(c4590e.mo1238const(admob)) || ((admob instanceof InterfaceC7557e) && AbstractC0083e.m249this((InterfaceC7557e) admob))) {
                    i = 1;
                }
                return ((license2 instanceof InterfaceC7557e) && AbstractC0083e.m249this((InterfaceC7557e) license2) && AbstractC0083e.m238goto(interfaceC9905e) && i != 0) ? c4590e.m1641final(admob) : (AbstractC0083e.m238goto(license2) || !AbstractC0083e.m234class(interfaceC9905e)) ? license2 : c4590e.m1641final(license2);
            }
        }
        return null;
    }

    public static void metrica() {
        AbstractC4265e.yandex("Not in application's main thread", purchase());
    }

    public static boolean purchase() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static final InterfaceC4752e vip(InterfaceC9905e interfaceC9905e) {
        AbstractC15728e subscription;
        AbstractC14773e purchase;
        AbstractC10226e billing = AbstractC0083e.billing(interfaceC9905e);
        if (billing == null && ((purchase = AbstractC0083e.purchase(interfaceC9905e)) == null || (billing = AbstractC0083e.m252try(purchase)) == null)) {
            billing = AbstractC0083e.billing(interfaceC9905e);
        }
        InterfaceC16046e remoteconfig = AbstractC0083e.remoteconfig(AbstractC0083e.m247strictfp(billing));
        if (remoteconfig != null) {
            return remoteconfig;
        }
        if (!(interfaceC9905e instanceof AbstractC1186e)) {
            StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
            sb.append(interfaceC9905e);
            sb.append(", ");
            throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC9905e.getClass(), sb).toString());
        }
        if (AbstractC13270e.isPro((AbstractC1186e) interfaceC9905e)) {
            InterfaceC0023e interfaceC0023e = (InterfaceC0023e) AbstractC13480e.m3590instanceof(AbstractC0083e.smaato(interfaceC9905e));
            if (AbstractC0083e.m236extends(interfaceC0023e)) {
                subscription = null;
            } else {
                if (!(interfaceC0023e instanceof AbstractC16232e)) {
                    StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                    sb2.append(interfaceC0023e);
                    sb2.append(", ");
                    throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, interfaceC0023e.getClass(), sb2).toString());
                }
                subscription = ((AbstractC16232e) interfaceC0023e).vip().subscription();
            }
            if (subscription != null) {
                return vip(subscription);
            }
        }
        return null;
    }

    public static final InterfaceC9905e yandex(InterfaceC9905e interfaceC9905e, InterfaceC9905e interfaceC9905e2) {
        AbstractC14773e purchase;
        C4590e c4590e = C4590e.f9890e;
        AbstractC10226e billing = AbstractC0083e.billing(interfaceC9905e);
        if (billing == null && ((purchase = AbstractC0083e.purchase(interfaceC9905e)) == null || (billing = AbstractC0083e.m252try(purchase)) == null)) {
            billing = AbstractC0083e.billing(interfaceC9905e);
        }
        if (AbstractC0083e.remoteconfig(AbstractC0083e.m247strictfp(billing)) != null) {
            return AbstractC0083e.m238goto(interfaceC9905e) ? c4590e.m1641final(interfaceC9905e2) : interfaceC9905e2;
        }
        InterfaceC0023e interfaceC0023e = (InterfaceC0023e) AbstractC13480e.m3590instanceof(AbstractC0083e.smaato(interfaceC9905e));
        if (AbstractC16986e.ad[AbstractC8703e.m2467class(AbstractC0083e.pro(interfaceC0023e))] == 1) {
            c4590e.amazon();
            throw null;
        }
        if (yandex(AbstractC0083e.subscription(c4590e, interfaceC0023e), interfaceC9905e2) instanceof AbstractC1186e) {
            c4590e.amazon();
            throw null;
        }
        StringBuilder sb = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
        sb.append(c4590e);
        sb.append(", ");
        throw new IllegalArgumentException(AbstractC1786e.subscription(AbstractC3820e.ad, c4590e.getClass(), sb).toString());
    }
}
