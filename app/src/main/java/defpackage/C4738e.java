package defpackage;

import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4738e extends AbstractC7185e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f10135e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f10136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4738e(Object obj, InterfaceC5083e interfaceC5083e, int i) {
        super(1, interfaceC5083e);
        this.f10135e = i;
        this.f10136e = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC5083e interfaceC5083e = (InterfaceC5083e) obj;
        switch (this.f10135e) {
            case 0:
                return ((C4738e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C4738e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 2:
                return ((C4738e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            case 3:
                return ((C4738e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
            default:
                return ((C4738e) mopub(interfaceC5083e)).loadAd(Unit.INSTANCE);
        }
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f10135e;
        Object obj2 = this.f10136e;
        switch (i) {
            case 0:
                AbstractC2003e.purchase(obj);
                C7558e.ad((C7558e) obj2);
                return Unit.INSTANCE;
            case 1:
                AbstractC2003e.purchase(obj);
                Log.d("CXCP", "tryOpenCamera: Camera open cancelled");
                ((C4246e) obj2).f9318e = null;
                return new C10171e(null, new C1096e(13), 1);
            case 2:
                AbstractC2003e.purchase(obj);
                ((C13135e) obj2).isVip.await();
                return Unit.INSTANCE;
            case 3:
                AbstractC2003e.purchase(obj);
                C7080e c7080e = (C7080e) AbstractC17947e.appmetrica(((C18046e) obj2).appmetrica, C7080e.Companion.serializer(), AbstractC6507e.mopub(new byte[]{(byte) 23411, (byte) 13424, (byte) 2401, (byte) 643186, (byte) 6101099, (byte) 16686, (byte) 22113, (byte) 39285, (byte) 1353844, (byte) 171783784, (byte) 43631, (byte) 114, (byte) 862569, (byte) 10814330, (byte) 472481889, (byte) 487284, (byte) 4713, (byte) 99166575, (byte) 10606}), AbstractC16398e.ad);
                if (c7080e != null) {
                    return c7080e.ad();
                }
                return null;
            default:
                AbstractC2003e.purchase(obj);
                ((C9755e) obj2).f19284e.signatures.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e mopub(InterfaceC5083e interfaceC5083e) {
        switch (this.f10135e) {
            case 0:
                return new C4738e((C7558e) this.f10136e, interfaceC5083e, 0);
            case 1:
                return new C4738e((C4246e) this.f10136e, interfaceC5083e, 1);
            case 2:
                return new C4738e((C13135e) this.f10136e, interfaceC5083e, 2);
            case 3:
                return new C4738e((C18046e) this.f10136e, interfaceC5083e, 3);
            default:
                return new C4738e((C9755e) this.f10136e, interfaceC5083e, 4);
        }
    }
}
