package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* renamed from: eُٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16926e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC12654e f33155e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33156e;

    public /* synthetic */ C16926e(AbstractC12654e abstractC12654e, int i) {
        this.f33156e = i;
        this.f33155e = abstractC12654e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f33156e;
        AbstractC12654e abstractC12654e = this.f33155e;
        switch (i) {
            case 0:
                C4942e c4942e = C4942e.smaato;
                InterfaceC8528e.ad.getClass();
                C8865e c8865e = C8865e.f17799e;
                List list = c4942e.ad;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean ad = c4942e.ad(C4942e.advert);
                EnumC2192e enumC2192e = EnumC2192e.f5576e;
                if (ad) {
                    Iterator it = abstractC12654e.yandex(c4942e, c8865e).iterator();
                    while (it.hasNext()) {
                        AbstractC9386e.vip(linkedHashSet, abstractC12654e.appmetrica((C0520e) it.next(), enumC2192e));
                    }
                }
                if (c4942e.ad(C4942e.startapp) && !list.contains(C2333e.ad)) {
                    Iterator it2 = abstractC12654e.startapp(c4942e, c8865e).iterator();
                    while (it2.hasNext()) {
                        linkedHashSet.addAll(abstractC12654e.ad((C0520e) it2.next(), enumC2192e));
                    }
                }
                if (c4942e.ad(C4942e.adcel) && !list.contains(C2333e.ad)) {
                    Iterator it3 = abstractC12654e.loadAd().iterator();
                    while (it3.hasNext()) {
                        linkedHashSet.addAll(abstractC12654e.purchase((C0520e) it3.next(), enumC2192e));
                    }
                }
                return AbstractC13480e.m3575continue(linkedHashSet);
            case 1:
                return abstractC12654e.mopub();
            case 2:
                return abstractC12654e.startapp(C4942e.Signature, null);
            case 3:
                C12575e c12575e = C4942e.metrica;
                return abstractC12654e.loadAd();
            default:
                return abstractC12654e.yandex(C4942e.loadAd, null);
        }
    }
}
