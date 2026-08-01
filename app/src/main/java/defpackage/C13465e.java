package defpackage;

import android.os.Bundle;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.LongPointerWrapper;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.io.File;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13465e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f26730e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f26731e;

    public /* synthetic */ C13465e(int i, Object obj) {
        this.f26731e = i;
        this.f26730e = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v20, types: [java.lang.Object, eؕٛؓ] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int m1878throw;
        C6571e c6571e;
        C6571e c6571e2;
        int i = this.f26731e;
        Object obj = this.f26730e;
        switch (i) {
            case 0:
                return (C12344e) obj;
            case 1:
                C5658e.ad.vip(((CustomCatalogBlockItem) obj).license);
                return Unit.INSTANCE;
            case 2:
                return (C5653e) ((C0624e) obj).ad.appmetrica.getValue();
            case 3:
                return Integer.valueOf(((AbstractC7674e) ((C3177e) obj).ad).subs());
            case 4:
                return "Unexpected end of input: yet to parse " + ((C13259e) obj).vip();
            case 5:
                InterfaceC8042e interfaceC8042e = (InterfaceC8042e) ((C4271e) obj).f9364e.getValue();
                C5227e c5227e = interfaceC8042e instanceof C5227e ? (C5227e) interfaceC8042e : null;
                return Integer.valueOf(c5227e != null ? c5227e.ad.size() : 0);
            case 6:
                long ptr$cinterop_release = ((C14097e) obj).f27878e.getPtr$cinterop_release();
                int i2 = AbstractC6026e.ad;
                return new LongPointerWrapper(realmcJNI.realm_query_find_all(ptr$cinterop_release), false, 2, null);
            case 7:
                return ((AbstractC15468e) ((AbstractC14601e) obj)).appmetrica();
            case 8:
                return new C15948e((InterfaceC1726e) obj);
            case 9:
                return new C4640e((C6194e) obj);
            case 10:
                ((C9013e) obj).m2514goto(new C5352e());
                return Unit.INSTANCE;
            case 11:
                ((C9289e) obj).startapp.subscription(BuildConfig.FLAVOR);
                return Unit.INSTANCE;
            case 12:
                ((C12979e) obj).purchase();
                return Unit.INSTANCE;
            case 13:
                return AbstractC4653e.applovin(new StringBuilder("Unexpected end of input: yet to parse '"), ((C6162e) obj).ad, '\'');
            case 14:
                C18384e c18384e = (C18384e) obj;
                return new C16763e(AbstractC10003e.license("kotlinx.serialization.Polymorphic", C13234e.appmetrica, new InterfaceC9998e[0], new C6846e(24, c18384e)), c18384e.ad);
            case 15:
                ((C10618e) obj).getClass();
                return UUID.randomUUID().toString();
            case 16:
                return Float.valueOf(((InterfaceC14468e) obj).invoke() < 1.0f ? 0.3f : 1.0f);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return (C12247e) obj;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C1615e c1615e = ((C14197e) obj).f28053e;
                c1615e.getClass();
                c1615e.smaato(null, BuildConfig.FLAVOR);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List mo457e = ((C10894e) obj).ad.ad().mo457e("Cookie");
                if (mo457e == null) {
                    return C9139e.f18290e;
                }
                HashMap hashMap = new HashMap(mo457e.size());
                Iterator it = mo457e.iterator();
                while (it.hasNext()) {
                    hashMap.putAll(AbstractC15064e.ad((String) it.next(), true));
                }
                return hashMap;
            case 20:
                C17345e c17345e = (C17345e) obj;
                ClassLoader classLoader = c17345e.f34031e;
                C18511e c18511e = c17345e.f34032e;
                ArrayList<URL> list = Collections.list(classLoader.getResources(BuildConfig.FLAVOR));
                ArrayList arrayList = new ArrayList();
                for (URL url : list) {
                    if (AbstractC7890e.billing(url.getProtocol(), "file")) {
                        String str = C10675e.f21023e;
                        c6571e2 = new C6571e(c18511e, C10215e.license(new File(url.toURI()).toString(), false));
                    } else {
                        c6571e2 = null;
                    }
                    if (c6571e2 != null) {
                        arrayList.add(c6571e2);
                    }
                }
                ArrayList list2 = Collections.list(classLoader.getResources("META-INF/MANIFEST.MF"));
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    String url2 = ((URL) it2.next()).toString();
                    if (AbstractC6507e.pro(url2, "jar:file:", false) && (m1878throw = AbstractC5304e.m1878throw(0, 6, url2, "!")) != -1) {
                        String str2 = C10675e.f21023e;
                        c6571e = new C6571e(AbstractC15182e.billing(C10215e.license(new File(URI.create(url2.substring(4, m1878throw))).toString(), false), c18511e, new C3114e(18)), C17345e.f34029e);
                    } else {
                        c6571e = null;
                    }
                    if (c6571e != null) {
                        arrayList2.add(c6571e);
                    }
                }
                return AbstractC13480e.m3584final(arrayList, arrayList2);
            case 21:
                return new C0444e((C16151e) ((C17790e) obj).f34883e.getValue());
            case 22:
                C18325e c18325e = (C18325e) obj;
                C10990e c10990e = InterfaceC11129e.vip;
                C10095e c10095e = new C10095e(1);
                c10095e.m4618e(c18325e.f35986e.getParameters());
                c18325e.f35985e.mo460e(new C12996e(c10095e, 1));
                return c10095e.build();
            case 23:
                C13840e c13840e = (C13840e) obj;
                InterfaceC12163e interfaceC12163e = c13840e.f27416e;
                Object obj2 = c13840e.f27415e;
                if (obj2 != null) {
                    return interfaceC12163e.Signature(c13840e, obj2);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C5891e c5891e = ((C15298e) obj).f30227e;
                if (c5891e == null) {
                    return null;
                }
                Bundle vip = AbstractC2301e.vip((C6571e[]) Arrays.copyOf(new C6571e[0], 0));
                c5891e.m1999protected(vip);
                if (vip.isEmpty()) {
                    return null;
                }
                return vip;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return AbstractC18129e.appmetrica((InterfaceC0816e) obj);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                InterfaceC10998e interfaceC10998e = (InterfaceC10998e) obj;
                interfaceC10998e.vip().ad(new C18149e(r3, interfaceC10998e));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C11359e c11359e = (C11359e) obj;
                C10318e c10318e = (C10318e) AbstractC10432e.vip(c11359e, AbstractC8281e.ad);
                c11359e.f22864e = c10318e;
                c11359e.f22867e = c10318e != null ? new C11644e(c10318e.ad, c10318e.vip, c10318e.metrica, c10318e.license) : null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                new C17312e(null, null, 13).signatures(((C14141e) obj).pro());
                return Unit.INSTANCE;
            default:
                new C17312e(null, null, 14).signatures(((C4944e) obj).pro());
                return Unit.INSTANCE;
        }
    }
}
