package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4787e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10211e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C17196e f10212e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f10213e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4787e(C17196e c17196e, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f10211e = i;
        this.f10212e = c17196e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f10211e) {
            case 0:
                C4787e c4787e = new C4787e(this.f10212e, interfaceC5083e, 0);
                c4787e.f10213e = obj;
                return c4787e;
            default:
                C4787e c4787e2 = new C4787e(this.f10212e, interfaceC5083e, 1);
                c4787e2.f10213e = obj;
                return c4787e2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13034e c13034e = (C13034e) obj;
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj2;
        switch (this.f10211e) {
            case 0:
                return ((C4787e) advert(interfaceC5083e, c13034e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4787e) advert(interfaceC5083e, c13034e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f10211e) {
            case 0:
                C13034e c13034e = (C13034e) this.f10213e;
                AbstractC2003e.purchase(obj);
                List list = c13034e.f25957e;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (hashSet.add(((C17196e) obj2).f33716e)) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
                Iterator it = arrayList.iterator();
                boolean z = false;
                while (true) {
                    boolean hasNext = it.hasNext();
                    C17196e c17196e = this.f10212e;
                    if (!hasNext) {
                        if (!z) {
                            arrayList2 = AbstractC13480e.m3572catch(c17196e, arrayList2);
                        }
                        return C13034e.vip(c13034e, false, null, arrayList2, false, false, 251);
                    }
                    C17196e c17196e2 = (C17196e) it.next();
                    if (AbstractC7890e.billing(c17196e2.f33716e, c17196e.f33716e)) {
                        z = true;
                    } else {
                        c17196e = c17196e2;
                    }
                    arrayList2.add(c17196e);
                }
            default:
                C13034e c13034e2 = (C13034e) this.f10213e;
                AbstractC2003e.purchase(obj);
                C17196e c17196e3 = this.f10212e;
                boolean billing = AbstractC7890e.billing(c17196e3.f33716e, c13034e2.f25956e);
                List list2 = c13034e2.f25957e;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : list2) {
                    if (!AbstractC7890e.billing(((C17196e) obj3).f33716e, c17196e3.f33716e)) {
                        arrayList3.add(obj3);
                    }
                }
                return C13034e.vip(c13034e2, false, billing ? BuildConfig.FLAVOR : c13034e2.f25956e, arrayList3, false, false, 249);
        }
    }
}
