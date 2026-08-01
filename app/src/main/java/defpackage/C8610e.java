package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌَۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8610e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17421e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f17422e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17423e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17424e;

    public /* synthetic */ C8610e(C10279e c10279e, EnumC16729e enumC16729e, boolean z) {
        this.f17424e = 1;
        this.f17421e = c10279e;
        this.f17423e = enumC16729e;
        this.f17422e = z;
    }

    public /* synthetic */ C8610e(boolean z, Object obj, Object obj2, int i) {
        this.f17424e = i;
        this.f17422e = z;
        this.f17421e = obj;
        this.f17423e = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f17424e) {
            case 0:
                C1718e c1718e = (C1718e) this.f17421e;
                AudioTrack audioTrack = (AudioTrack) this.f17423e;
                InterfaceC5083e interfaceC5083e = null;
                if (this.f17422e) {
                    c1718e.getClass();
                    AbstractC5336e.purchase(c1718e, null, 0, new C16998e(audioTrack, c1718e, interfaceC5083e, 1), 3);
                } else {
                    c1718e.getClass();
                    AbstractC5336e.purchase(c1718e, null, 0, new C16998e(audioTrack, c1718e, interfaceC5083e, 0), 3);
                }
                return Unit.INSTANCE;
            case 1:
                C10279e c10279e = (C10279e) this.f17421e;
                EnumC16729e enumC16729e = (EnumC16729e) this.f17423e;
                ((NextDockView) c10279e.ad.f36547e.f10519e).vip(String.valueOf(AbstractC1660e.firebase(EnumC16729e.f32792e, (EnumC16729e[]) c10279e.vip.f36443e)), true, false);
                c10279e.appmetrica(enumC16729e, this.f17422e);
                return Unit.INSTANCE;
            default:
                C1490e c1490e = (C1490e) this.f17421e;
                C3566e c3566e = (C3566e) this.f17423e;
                if (this.f17422e) {
                    c1490e.license.invoke(c3566e);
                } else {
                    new C9745e().signatures(c3566e.f10582e);
                    c3566e.purchase();
                }
                return Unit.INSTANCE;
        }
    }
}
