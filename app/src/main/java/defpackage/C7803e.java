package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًًٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7803e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f15809e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f15810e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC16132e f15811e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f15812e;

    public /* synthetic */ C7803e(Object obj, Object obj2, InterfaceC16132e interfaceC16132e, int i) {
        this.f15812e = i;
        this.f15810e = obj;
        this.f15809e = obj2;
        this.f15811e = interfaceC16132e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15812e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Number) obj2).intValue();
                MainArtist mainArtist = (MainArtist) this.f15810e;
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    boolean yandex = c13770e.yandex(mainArtist);
                    InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f15809e;
                    InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) this.f15811e;
                    Object m3681throw = c13770e.m3681throw();
                    if (yandex || m3681throw == C2987e.ad) {
                        m3681throw = new C7965e(2, mainArtist, interfaceC3314e, interfaceC3314e2);
                        c13770e.m3682throws(m3681throw);
                    }
                    AbstractC0014e.metrica((Function0) m3681throw, null, false, null, null, null, AbstractC12900e.billing, c13770e, 1572864, 62);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            default:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Number) obj2).intValue();
                InterfaceC18435e interfaceC18435e = (InterfaceC18435e) this.f15809e;
                C17196e c17196e = (C17196e) this.f15810e;
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    boolean billing = AbstractC7890e.billing(c17196e.f33716e, ((C13034e) this.f15811e.getValue()).f25956e);
                    boolean yandex2 = c13770e2.yandex(interfaceC18435e) | c13770e2.yandex(c17196e);
                    Object m3681throw2 = c13770e2.m3681throw();
                    if (yandex2 || m3681throw2 == C2987e.ad) {
                        m3681throw2 = new C13216e(interfaceC18435e, c17196e, 1);
                        c13770e2.m3682throws(m3681throw2);
                    }
                    AbstractC4530e.ad(billing, (Function0) m3681throw2, null, false, null, c13770e2, 0);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
