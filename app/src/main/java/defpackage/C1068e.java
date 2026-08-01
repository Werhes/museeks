package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٕؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1068e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f3597e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3598e;

    public /* synthetic */ C1068e(int i, Object obj) {
        this.f3598e = i;
        this.f3597e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f3598e) {
            case 0:
                return AbstractC13480e.m3572catch(this.f3597e, (List) obj);
            case 1:
                List list = (List) obj;
                Object m3570break = AbstractC13480e.m3570break(list);
                Object obj2 = this.f3597e;
                return AbstractC7890e.billing(m3570break, obj2) ? list : AbstractC13480e.m3572catch(obj2, list);
            case 2:
                List list2 = (List) obj;
                Object m3570break2 = AbstractC13480e.m3570break(list2);
                Object obj3 = this.f3597e;
                return AbstractC7890e.billing(m3570break2, obj3) ? list2 : AbstractC13480e.m3572catch(obj3, list2);
            default:
                List list3 = (List) obj;
                Object m3570break3 = AbstractC13480e.m3570break(list3);
                Object obj4 = this.f3597e;
                return AbstractC7890e.billing(m3570break3, obj4) ? list3 : AbstractC13480e.m3572catch(obj4, list3);
        }
    }
}
