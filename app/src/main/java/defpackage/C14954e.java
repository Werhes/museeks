package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14954e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f29648e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ long f29649e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12864e f29650e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f29651e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29652e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f29653e;

    public /* synthetic */ C14954e(InterfaceC12864e interfaceC12864e, long j, List list, int i, int i2) {
        this.f29652e = 2;
        this.f29650e = interfaceC12864e;
        this.f29649e = j;
        this.f29653e = list;
        this.f29651e = i;
        this.f29648e = i2;
    }

    public /* synthetic */ C14954e(Object obj, InterfaceC12864e interfaceC12864e, long j, int i, int i2, int i3) {
        this.f29652e = i3;
        this.f29653e = obj;
        this.f29650e = interfaceC12864e;
        this.f29649e = j;
        this.f29651e = i;
        this.f29648e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f29652e) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC5805e.ad((InterfaceC6790e) this.f29653e, this.f29650e, this.f29649e, (C13770e) obj, AbstractC5190e.advert(this.f29651e | 1), this.f29648e);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC4260e.ad((AbstractC10727e) this.f29653e, this.f29650e, this.f29649e, (C13770e) obj, AbstractC5190e.advert(this.f29651e | 1), this.f29648e);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC6232e.vip(this.f29650e, this.f29649e, (List) this.f29653e, (C13770e) obj, AbstractC5190e.advert(this.f29651e | 1), this.f29648e);
                return Unit.INSTANCE;
        }
    }
}
