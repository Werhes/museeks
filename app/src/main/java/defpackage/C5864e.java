package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C5864e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ List f12405e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f12406e;

    public /* synthetic */ C5864e(int i, List list) {
        this.f12406e = i;
        this.f12405e = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f12406e) {
            case 0:
                Integer num = (Integer) this.f12405e.get(2);
                num.intValue();
                return num;
            case 1:
                return this.f12405e;
            case 2:
                C8416e c8416e = C8416e.appmetrica;
                StringBuilder sb = new StringBuilder();
                C14027e.ad.getClass();
                sb.append(C14027e.metrica());
                List list = this.f12405e;
                sb.append(list.hashCode());
                c8416e.vip(new AbstractC3002e(sb.toString(), "Мультивыбор", list));
                return Unit.INSTANCE;
            case 3:
                return ((InterfaceC13984e) this.f12405e.get(0)).isVip();
            default:
                return ((InterfaceC13984e) this.f12405e.get(0)).isVip();
        }
    }
}
