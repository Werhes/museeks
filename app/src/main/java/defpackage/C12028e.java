package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ۠ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12028e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f24052e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ boolean f24053e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ CachedTrack f24054e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C11188e f24055e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12028e(C11188e c11188e, CachedTrack cachedTrack, boolean z, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f24055e = c11188e;
        this.f24054e = cachedTrack;
        this.f24053e = z;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        return new C12028e(this.f24055e, this.f24054e, this.f24053e, interfaceC5083e);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12028e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i;
        int i2 = this.f24052e;
        C11188e c11188e = this.f24055e;
        if (i2 == 0) {
            AbstractC2003e.purchase(obj);
            InterfaceC1108e interfaceC1108e = c11188e.m3046e().metrica;
            this.f24052e = 1;
            obj = AbstractC7535e.startapp(interfaceC1108e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((C1254e) it.next()).ad);
        }
        int ordinal = ((EnumC2502e) c11188e.f22451e.getValue()).ordinal();
        if (ordinal == 0) {
            i = R.string.cache_track_selector_my_library;
        } else if (ordinal == 1) {
            i = R.string.cache_track_selector_manual_library;
        } else {
            if (ordinal != 2) {
                throw new C14803e(10);
            }
            i = R.string.cache_track_selector_all;
        }
        VKXApplication.Companion companion = VKXApplication.f36531e;
        String vip = VKXApplication.Companion.vip(i);
        AppActivity appActivity = (AppActivity) c11188e.pro();
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((CachedTrack) it2.next()).m4723for());
        }
        C0552e c0552e = new C0552e(arrayList2, vip);
        CachedTrack cachedTrack = this.f24054e;
        String applovin = cachedTrack != null ? cachedTrack.applovin() : null;
        InterfaceC14517e c1703e = applovin != null ? new C1703e(applovin) : C2406e.ad;
        ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((CachedTrack) it3.next()).metrica());
        }
        AbstractC13201e.metrica(appActivity, c0552e, new C0086e(c1703e, 0L, arrayList3, false, false, this.f24053e, 90));
        return Unit.INSTANCE;
    }
}
