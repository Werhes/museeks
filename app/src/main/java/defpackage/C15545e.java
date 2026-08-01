package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.AudioSnippetEntry;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15545e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30692e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30693e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f30694e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30695e;

    public /* synthetic */ C15545e(C13867e c13867e, String str, boolean z, int i) {
        this.f30695e = 5;
        this.f30692e = c13867e;
        this.f30694e = str;
        this.f30693e = z;
    }

    public /* synthetic */ C15545e(Object obj, Object obj2, boolean z, int i) {
        this.f30695e = i;
        this.f30692e = obj;
        this.f30693e = z;
        this.f30694e = obj2;
    }

    public /* synthetic */ C15545e(Object obj, boolean z, Object obj2, int i, int i2) {
        this.f30695e = i2;
        this.f30692e = obj;
        this.f30693e = z;
        this.f30694e = obj2;
    }

    public /* synthetic */ C15545e(boolean z, Object obj, Object obj2, int i, int i2) {
        this.f30695e = i2;
        this.f30693e = z;
        this.f30692e = obj;
        this.f30694e = obj2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30695e) {
            case 0:
                C13621e c13621e = (C13621e) this.f30692e;
                C16875e c16875e = (C16875e) this.f30694e;
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    c13621e.vip(this.f30693e, AbstractC12220e.mopub(C0115e.f1276e, 16), AbstractC16653e.license(-1656659094, new C13268e(c13621e, c16875e, 1), c13770e), c13770e, 432);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ((C1718e) this.f30692e).m683strictfp(this.f30693e, (AudioSnippetEntry) this.f30694e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC16565e.vip(this.f30693e, (Function1) this.f30692e, (InterfaceC12864e) this.f30694e, (C13770e) obj, AbstractC5190e.advert(385));
                return Unit.INSTANCE;
            case 3:
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f30692e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f30694e;
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean z = ((C13034e) interfaceC16132e.getValue()).f25962e;
                    boolean yandex = c13770e2.yandex(interfaceC18435e);
                    Object m3681throw = c13770e2.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C17744e(interfaceC18435e, 14);
                        c13770e2.m3682throws(m3681throw);
                    }
                    AbstractC8844e.ad(z, (Function1) m3681throw, null, this.f30693e, null, c13770e2, 0, 108);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                ((C10102e) this.f30692e).vip(this.f30693e, (Function2) this.f30694e, (C13770e) obj, AbstractC5190e.advert(3073));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ((C13867e) this.f30692e).billing((String) this.f30694e, this.f30693e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC4608e.vip(this.f30693e, (C4242e) this.f30692e, (Function0) this.f30694e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC18489e.yandex((C0217e) this.f30692e, this.f30693e, (Function0) this.f30694e, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
        }
    }
}
