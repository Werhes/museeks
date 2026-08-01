package defpackage;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: eٖٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16314e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C8624e f32062e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32063e;

    public /* synthetic */ C16314e(C8624e c8624e, int i) {
        this.f32063e = i;
        this.f32062e = c8624e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Collection collection;
        Collection collection2;
        C8268e c8268e;
        C4956e metrica;
        C13212e ad;
        C13212e ad2;
        C0520e c0520e = (C0520e) obj;
        switch (this.f32063e) {
            case 0:
                C8624e c8624e = this.f32062e;
                LinkedHashMap linkedHashMap = c8624e.ad;
                C13141e c13141e = C9920e.f19580e;
                AbstractC4362e abstractC4362e = c8624e.startapp;
                byte[] bArr = (byte[]) linkedHashMap.get(c0520e);
                if (bArr != null) {
                    C7965e c7965e = new C7965e(3, c13141e, new ByteArrayInputStream(bArr), abstractC4362e);
                    collection = AbstractC7762e.Signature(new C15006e(new C6993e(c7965e, new C17897e(12, c7965e), 0)));
                } else {
                    collection = C13664e.f27089e;
                }
                ArrayList arrayList = new ArrayList(collection.size());
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    C0530e purchase = ((C9864e) abstractC4362e.vip.f10516e).purchase((C9920e) it.next());
                    if (!abstractC4362e.subscription(purchase)) {
                        purchase = null;
                    }
                    if (purchase != null) {
                        arrayList.add(purchase);
                    }
                }
                abstractC4362e.adcel(c0520e, arrayList);
                return AbstractC9386e.license(arrayList);
            case 1:
                C8624e c8624e2 = this.f32062e;
                LinkedHashMap linkedHashMap2 = c8624e2.vip;
                C13141e c13141e2 = C17485e.f34249e;
                AbstractC4362e abstractC4362e2 = c8624e2.startapp;
                byte[] bArr2 = (byte[]) linkedHashMap2.get(c0520e);
                if (bArr2 != null) {
                    C7965e c7965e2 = new C7965e(3, c13141e2, new ByteArrayInputStream(bArr2), abstractC4362e2);
                    collection2 = AbstractC7762e.Signature(new C15006e(new C6993e(c7965e2, new C17897e(12, c7965e2), 0)));
                } else {
                    collection2 = C13664e.f27089e;
                }
                ArrayList arrayList2 = new ArrayList(collection2.size());
                Iterator it2 = collection2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((C9864e) abstractC4362e2.vip.f10516e).billing((C17485e) it2.next(), false));
                }
                abstractC4362e2.mopub(c0520e, arrayList2);
                return AbstractC9386e.license(arrayList2);
            default:
                C8624e c8624e3 = this.f32062e;
                C4956e c4956e = c8624e3.startapp.vip;
                byte[] bArr3 = (byte[]) c8624e3.metrica.get(c0520e);
                if (bArr3 != null) {
                    C16162e c16162e = (C16162e) C16162e.f31743e.metrica(new ByteArrayInputStream(bArr3), (C18521e) ((C18277e) c4956e.f10517e).loadAd);
                    if (c16162e != null) {
                        C9864e c9864e = (C9864e) c4956e.f10516e;
                        C4956e c4956e2 = c9864e.ad;
                        InterfaceC11824e interfaceC11824e = (InterfaceC11824e) c4956e2.f10513e;
                        C17221e c17221e = (C17221e) c4956e2.f10515e;
                        List list = c16162e.f31754e;
                        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(list, 10));
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(c9864e.vip.subscription((C4599e) it3.next(), interfaceC11824e));
                        }
                        InterfaceC2460e c4155e = arrayList3.isEmpty() ? C4590e.f9885e : new C4155e(0, arrayList3);
                        EnumC6217e enumC6217e = (EnumC6217e) AbstractC1787e.license.appmetrica(c16162e.f31755e);
                        switch (enumC6217e == null ? -1 : AbstractC12419e.vip[enumC6217e.ordinal()]) {
                            case 1:
                                c8268e = AbstractC6050e.license;
                                break;
                            case 2:
                                c8268e = AbstractC6050e.ad;
                                break;
                            case 3:
                                c8268e = AbstractC6050e.vip;
                                break;
                            case 4:
                                c8268e = AbstractC6050e.metrica;
                                break;
                            case 5:
                                c8268e = AbstractC6050e.appmetrica;
                                break;
                            case 6:
                                c8268e = AbstractC6050e.purchase;
                                break;
                            default:
                                c8268e = AbstractC6050e.ad;
                                break;
                        }
                        C14457e c14457e = new C14457e((C6272e) ((C18277e) c4956e2.f10517e).ad, (InterfaceC15498e) c4956e2.f10512e, c4155e, AbstractC17487e.metrica(interfaceC11824e, c16162e.f31745e), c8268e, c16162e, (InterfaceC11824e) c4956e2.f10513e, c17221e, (C5311e) c4956e2.f10511e, (InterfaceC7794e) c4956e2.f10518e);
                        metrica = c4956e2.metrica(c14457e, c16162e.f31758e, (InterfaceC11824e) c4956e2.f10513e, (C17221e) c4956e2.f10515e, (C5311e) c4956e2.f10511e, (AbstractC8470e) c4956e2.f10519e);
                        C5306e c5306e = (C5306e) metrica.f10514e;
                        List admob = c5306e.admob();
                        int i = c16162e.f31748e;
                        if ((i & 4) == 4) {
                            ad = c16162e.f31757e;
                        } else {
                            if ((i & 8) != 8) {
                                throw new IllegalStateException("No underlyingType in ProtoBuf.TypeAlias");
                            }
                            ad = c17221e.ad(c16162e.f31753e);
                        }
                        AbstractC10226e premium = c5306e.premium(ad, false);
                        int i2 = c16162e.f31748e;
                        if ((i2 & 16) == 16) {
                            ad2 = c16162e.f31756e;
                        } else {
                            if ((i2 & 32) != 32) {
                                throw new IllegalStateException("No expandedType in ProtoBuf.TypeAlias");
                            }
                            ad2 = c17221e.ad(c16162e.f31749e);
                        }
                        c14457e.m3804e(admob, premium, c5306e.premium(ad2, false));
                        return c14457e;
                    }
                }
                return null;
        }
    }
}
