package defpackage;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۜٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4397e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f9573e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ PlaybackService f9574e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4397e(PlaybackService playbackService, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f9573e = i;
        this.f9574e = playbackService;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f9573e) {
            case 0:
                return new C4397e(this.f9574e, interfaceC5083e, 0);
            default:
                return new C4397e(this.f9574e, interfaceC5083e, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f9573e) {
            case 0:
                return ((C4397e) advert((InterfaceC5083e) obj2, (C4277e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C4397e) advert((InterfaceC5083e) obj2, (C16716e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        switch (this.f9573e) {
            case 0:
                AbstractC2003e.purchase(obj);
                C14609e vip = PlaybackService.advert().vip();
                Object obj2 = vip != null ? vip.vip : null;
                InterfaceC10136e interfaceC10136e = obj2 instanceof InterfaceC10136e ? (InterfaceC10136e) obj2 : null;
                this.f9574e.m4747class(interfaceC10136e != null ? Boolean.valueOf(interfaceC10136e.getPurchase()) : null);
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                Iterator it = AbstractC1660e.isPro(this.f9574e.f36752e).iterator();
                while (it.hasNext()) {
                    ((C6572e) it.next()).yandex();
                }
                return Unit.INSTANCE;
        }
    }
}
