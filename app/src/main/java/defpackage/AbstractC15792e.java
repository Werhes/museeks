package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.NativePointer;
import io.realm.kotlin.internal.interop.realm_class_info_t;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۡۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15792e {
    public static final InterfaceC10518e Signature(C18506e c18506e, InterfaceC7227e interfaceC7227e, C17974e c17974e, InterfaceC15348e interfaceC15348e) {
        InterfaceC10518e loadAd = c17974e.loadAd(interfaceC7227e);
        long ptr$cinterop_release = ((LongPointerWrapper) interfaceC15348e.remoteconfig()).getPtr$cinterop_release();
        long j = c18506e.ad;
        long j2 = c18506e.vip;
        int i = AbstractC6026e.ad;
        advert(loadAd, interfaceC15348e, c17974e, interfaceC7227e, new LongPointerWrapper(realmcJNI.realm_get_object(ptr$cinterop_release, j, j2), false, 2, null));
        return loadAd;
    }

    public static final C16861e ad(AbstractC1186e abstractC1186e) {
        C4168e c4168e;
        if (abstractC1186e.subscription() instanceof AbstractC14773e) {
            C16861e ad = ad(AbstractC9600e.metrica(abstractC1186e));
            C16861e ad2 = ad(AbstractC9600e.license(abstractC1186e));
            return new C16861e(AbstractC10653e.appmetrica(AbstractC1596e.ad(AbstractC9600e.metrica((AbstractC1186e) ad.ad), AbstractC9600e.license((AbstractC1186e) ad2.ad)), AbstractC10653e.vip(abstractC1186e)), AbstractC10653e.appmetrica(AbstractC1596e.ad(AbstractC9600e.metrica((AbstractC1186e) ad.vip), AbstractC9600e.license((AbstractC1186e) ad2.vip)), AbstractC10653e.vip(abstractC1186e)));
        }
        InterfaceC5021e loadAd = abstractC1186e.loadAd();
        boolean z = true;
        if (abstractC1186e.loadAd() instanceof InterfaceC17348e) {
            AbstractC16232e isPro = ((InterfaceC17348e) loadAd).isPro();
            AbstractC1186e yandex = AbstractC11957e.yandex(isPro.vip(), abstractC1186e.Signature());
            int m2467class = AbstractC8703e.m2467class(isPro.ad());
            if (m2467class == 1) {
                return new C16861e(yandex, abstractC1186e.loadAd().amazon().loadAd());
            }
            if (m2467class == 2) {
                return new C16861e(AbstractC11957e.yandex(abstractC1186e.loadAd().amazon().amazon(), abstractC1186e.Signature()), yandex);
            }
            throw new AssertionError("Only nontrivial projections should have been captured, not: " + isPro);
        }
        if (abstractC1186e.mopub().isEmpty() || abstractC1186e.mopub().size() != loadAd.getParameters().size()) {
            return new C16861e(abstractC1186e, abstractC1186e);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = AbstractC13480e.m3579e(loadAd.getParameters(), abstractC1186e.mopub()).iterator();
        while (it.hasNext()) {
            C6571e c6571e = (C6571e) it.next();
            AbstractC16232e abstractC16232e = (AbstractC16232e) c6571e.f13544e;
            InterfaceC16046e interfaceC16046e = (InterfaceC16046e) c6571e.f13543e;
            int mo2738e = interfaceC16046e.mo2738e();
            if (mo2738e == 0) {
                C4542e.ad(35);
                throw null;
            }
            if (abstractC16232e == null) {
                C4542e.ad(36);
                throw null;
            }
            C4542e c4542e = C4542e.vip;
            int m2467class2 = AbstractC8703e.m2467class(abstractC16232e.metrica() ? 3 : C4542e.vip(mo2738e, abstractC16232e.ad()));
            if (m2467class2 == 0) {
                c4168e = new C4168e(interfaceC16046e, abstractC16232e.vip(), abstractC16232e.vip());
            } else if (m2467class2 == 1) {
                c4168e = new C4168e(interfaceC16046e, abstractC16232e.vip(), AbstractC2876e.appmetrica(interfaceC16046e).loadAd());
            } else {
                if (m2467class2 != 2) {
                    throw new C14803e(10);
                }
                c4168e = new C4168e(interfaceC16046e, AbstractC2876e.appmetrica(interfaceC16046e).amazon(), abstractC16232e.vip());
            }
            if (abstractC16232e.metrica()) {
                arrayList.add(c4168e);
                arrayList2.add(c4168e);
            } else {
                C16861e ad3 = ad(c4168e.vip);
                AbstractC1186e abstractC1186e2 = (AbstractC1186e) ad3.ad;
                AbstractC1186e abstractC1186e3 = (AbstractC1186e) ad3.vip;
                C16861e ad4 = ad(c4168e.metrica);
                AbstractC1186e abstractC1186e4 = (AbstractC1186e) ad4.ad;
                AbstractC1186e abstractC1186e5 = (AbstractC1186e) ad4.vip;
                InterfaceC16046e interfaceC16046e2 = c4168e.ad;
                C4168e c4168e2 = new C4168e(interfaceC16046e2, abstractC1186e3, abstractC1186e4);
                C4168e c4168e3 = new C4168e(interfaceC16046e2, abstractC1186e2, abstractC1186e5);
                arrayList.add(c4168e2);
                arrayList2.add(c4168e3);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C4168e c4168e4 = (C4168e) it2.next();
                c4168e4.getClass();
                if (!InterfaceC9853e.ad.vip(c4168e4.vip, c4168e4.metrica)) {
                    break;
                }
            }
        }
        z = false;
        return new C16861e(z ? abstractC1186e.loadAd().amazon().amazon() : loadAd(abstractC1186e, arrayList), loadAd(abstractC1186e, arrayList2));
    }

    public static Object adcel(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    public static final InterfaceC10518e admob(C13655e c13655e) {
        C17974e c17974e = c13655e.f27074e;
        InterfaceC7227e interfaceC7227e = c13655e.f27073e;
        InterfaceC10518e loadAd = c17974e.loadAd(interfaceC7227e);
        advert(loadAd, c13655e.f27072e, c17974e, interfaceC7227e, c13655e.f27071e);
        return loadAd;
    }

    public static final void advert(InterfaceC10518e interfaceC10518e, InterfaceC15348e interfaceC15348e, C17974e c17974e, InterfaceC7227e interfaceC7227e, LongPointerWrapper longPointerWrapper) {
        String ad;
        if (interfaceC10518e instanceof InterfaceC16120e) {
            NativePointer remoteconfig = interfaceC15348e.remoteconfig();
            long ptr$cinterop_release = longPointerWrapper.getPtr$cinterop_release();
            int i = AbstractC6026e.ad;
            long realm_object_get_table = realmcJNI.realm_object_get_table(ptr$cinterop_release);
            realm_class_info_t realm_class_info_tVar = new realm_class_info_t();
            realmcJNI.realm_get_class(((LongPointerWrapper) remoteconfig).getPtr$cinterop_release(), realm_object_get_table, realm_class_info_tVar.ad, realm_class_info_tVar);
            ad = realmcJNI.realm_class_info_t_name_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_primary_key_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_properties_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_num_computed_properties_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_key_get(realm_class_info_tVar.ad, realm_class_info_tVar);
            realmcJNI.realm_class_info_t_flags_get(realm_class_info_tVar.ad, realm_class_info_tVar);
        } else {
            ad = AbstractC2863e.vip(interfaceC7227e).ad();
        }
        interfaceC10518e.isVip(new C13655e(ad, interfaceC7227e, interfaceC15348e, c17974e, longPointerWrapper));
    }

    public static void amazon(boolean z, ListenableFuture listenableFuture, C7169e c7169e, ExecutorC0082e executorC0082e) {
        listenableFuture.getClass();
        c7169e.getClass();
        executorC0082e.getClass();
        listenableFuture.ad(new RunnableC17144e(listenableFuture, new C2362e(14, c7169e), 0), executorC0082e);
        if (z) {
            RunnableC7527e runnableC7527e = new RunnableC7527e(listenableFuture, 0);
            ExecutorC0082e billing = AbstractC3062e.billing();
            C4001e c4001e = c7169e.metrica;
            if (c4001e != null) {
                c4001e.ad(runnableC7527e, billing);
            }
        }
    }

    public static void appmetrica(int i, long j, long[] jArr) {
        long metrica = AbstractC14059e.metrica(1, AbstractC14059e.metrica(2, AbstractC14059e.metrica(4, AbstractC14059e.metrica(8, AbstractC14059e.metrica(16, j, 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
        jArr[i] = metrica & (-6148914691236517206L);
        jArr[i + 1] = (metrica << 1) & (-6148914691236517206L);
    }

    public static C0353e billing() {
        return (C0353e) C0353e.startapp.getValue();
    }

    public static void license(int i, long[] jArr, long[] jArr2) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            long metrica = AbstractC14059e.metrica(1, AbstractC14059e.metrica(2, AbstractC14059e.metrica(4, AbstractC14059e.metrica(8, AbstractC14059e.metrica(16, jArr[i3], 4294901760L), 280375465148160L), 67555025218437360L), 868082074056920076L), 2459565876494606882L);
            jArr2[i2] = metrica & 6148914691236517205L;
            jArr2[i2 + 1] = (metrica >>> 1) & 6148914691236517205L;
            i2 += 2;
        }
    }

    public static final AbstractC1186e loadAd(AbstractC1186e abstractC1186e, ArrayList arrayList) {
        C7878e c7878e;
        abstractC1186e.mopub().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4168e c4168e = (C4168e) it.next();
            c4168e.getClass();
            AbstractC1186e abstractC1186e2 = c4168e.metrica;
            AbstractC1186e abstractC1186e3 = c4168e.vip;
            InterfaceC16046e interfaceC16046e = c4168e.ad;
            InterfaceC9853e.ad.vip(abstractC1186e3, abstractC1186e2);
            if (!AbstractC7890e.billing(abstractC1186e3, abstractC1186e2)) {
                if (interfaceC16046e.mo2738e() != 2) {
                    if (AbstractC13270e.firebase(abstractC1186e3) && interfaceC16046e.mo2738e() != 2) {
                        c7878e = new C7878e(3 != interfaceC16046e.mo2738e() ? 3 : 1, abstractC1186e2);
                    } else {
                        if (abstractC1186e2 == null) {
                            AbstractC13270e.ad(140);
                            throw null;
                        }
                        if (AbstractC13270e.inmobi(abstractC1186e2) && abstractC1186e2.Signature()) {
                            c7878e = new C7878e(2 == interfaceC16046e.mo2738e() ? 1 : 2, abstractC1186e3);
                        } else {
                            c7878e = new C7878e(3 != interfaceC16046e.mo2738e() ? 3 : 1, abstractC1186e2);
                        }
                    }
                    arrayList2.add(c7878e);
                }
            }
            c7878e = new C7878e(abstractC1186e3);
            arrayList2.add(c7878e);
        }
        return AbstractC14430e.adcel(abstractC1186e, arrayList2, null, 6);
    }

    public static long metrica(int i) {
        return (((r6 >>> 1) & 1431655765) << 32) | (1431655765 & AbstractC14059e.vip(AbstractC14059e.vip(AbstractC14059e.vip(AbstractC14059e.vip(i, 65280, 8), 15728880, 4), 202116108, 2), 572662306, 1));
    }

    public static C4065e mopub(Object obj) {
        return obj == null ? C4065e.f9036e : new C4065e(0, obj);
    }

    public static long pro(long j) {
        return AbstractC14059e.metrica(16, AbstractC14059e.metrica(8, AbstractC14059e.metrica(4, AbstractC14059e.metrica(2, AbstractC14059e.metrica(1, j, 2459565876494606882L), 868082074056920076L), 67555025218437360L), 280375465148160L), 4294901760L);
    }

    public static Object purchase(Future future) {
        AbstractC4265e.yandex("Future was expected to be done, " + future, future.isDone());
        return adcel(future);
    }

    public static RunnableC3397e remoteconfig(ListenableFuture listenableFuture, InterfaceC7961e interfaceC7961e, Executor executor) {
        RunnableC3397e runnableC3397e = new RunnableC3397e(interfaceC7961e, listenableFuture);
        listenableFuture.ad(runnableC3397e, executor);
        return runnableC3397e;
    }

    public static ListenableFuture smaato(ListenableFuture listenableFuture) {
        listenableFuture.getClass();
        return listenableFuture.isDone() ? listenableFuture : AbstractC5750e.purchase(new C17687e(7, listenableFuture));
    }

    public static final C4940e startapp(InterfaceC14287e interfaceC14287e) {
        if (((InterfaceC10518e) interfaceC14287e).getF36702e() != null) {
            return yandex(interfaceC14287e);
        }
        return null;
    }

    public static final InterfaceC10518e subscription(LongPointerWrapper longPointerWrapper, InterfaceC7227e interfaceC7227e, C17974e c17974e, InterfaceC15348e interfaceC15348e) {
        InterfaceC10518e loadAd = c17974e.loadAd(interfaceC7227e);
        advert(loadAd, interfaceC15348e, c17974e, interfaceC7227e, longPointerWrapper);
        return loadAd;
    }

    public static int vip(int i) {
        int i2 = i & 65535;
        int i3 = (i2 | (i2 << 8)) & 16711935;
        int i4 = (i3 | (i3 << 4)) & 252645135;
        int i5 = (i4 | (i4 << 2)) & 858993459;
        return (i5 | (i5 << 1)) & 1431655765;
    }

    public static final C4940e yandex(InterfaceC14287e interfaceC14287e) {
        C13655e f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e();
        if (f36702e == null) {
            throw new IllegalStateException("Identifier can only be calculated for managed objects.");
        }
        InterfaceC15348e interfaceC15348e = f36702e.f27072e;
        long j = f36702e.f27076e.vip;
        long ptr$cinterop_release = f36702e.f27071e.getPtr$cinterop_release();
        int i = AbstractC6026e.ad;
        return new C4940e(j, realmcJNI.realm_object_get_key(ptr$cinterop_release), interfaceC15348e.mo661throw(), ((C14918e) interfaceC15348e.inmobi().f22047e).metrica);
    }
}
