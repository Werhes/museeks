package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15284e implements Function2 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C2892e f30204e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4034e f30205e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30206e;

    public /* synthetic */ C15284e(C2892e c2892e, C4034e c4034e) {
        this.f30206e = 2;
        this.f30204e = c2892e;
        this.f30205e = c4034e;
    }

    public /* synthetic */ C15284e(C4034e c4034e, C2892e c2892e, int i, int i2) {
        this.f30206e = i2;
        this.f30205e = c4034e;
        this.f30204e = c2892e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C14980e c14980e;
        C12850e metrica;
        int i;
        C14980e c14980e2;
        C12850e metrica2;
        boolean z;
        int i2 = this.f30206e;
        C4034e c4034e = this.f30205e;
        C2892e c2892e = this.f30204e;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC12511e.ad(c4034e, c2892e, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC6190e.ad(c4034e, c2892e, (C13770e) obj, AbstractC5190e.advert(49));
                return Unit.INSTANCE;
            default:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                int i3 = 1;
                int i4 = 0;
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    c2892e.invoke(c13770e, 0);
                    if (c4034e.billing() && ((Boolean) c4034e.startapp.getValue()).booleanValue()) {
                        C9106e purchase = c4034e.purchase();
                        if (!(purchase == null ? true : AbstractC7890e.billing(purchase.ad, purchase.vip))) {
                            c13770e.m3676strictfp(-1736224054);
                            C9106e purchase2 = c4034e.purchase();
                            if (purchase2 == null) {
                                c13770e.m3676strictfp(2011629175);
                                c13770e.Signature(false);
                                z = false;
                            } else {
                                c13770e.m3676strictfp(2011629176);
                                c13770e.m3676strictfp(-1736222526);
                                List startapp = AbstractC6874e.startapp(Boolean.TRUE, Boolean.FALSE);
                                int size = startapp.size();
                                int i5 = 0;
                                while (i5 < size) {
                                    boolean booleanValue = ((Boolean) startapp.get(i5)).booleanValue();
                                    boolean billing = c13770e.billing(booleanValue);
                                    Object m3681throw = c13770e.m3681throw();
                                    Object obj3 = C2987e.ad;
                                    if (billing || m3681throw == obj3) {
                                        m3681throw = new C17588e(booleanValue, c4034e);
                                        c13770e.m3682throws(m3681throw);
                                    }
                                    InterfaceC11944e interfaceC11944e = (InterfaceC11944e) m3681throw;
                                    boolean billing2 = c13770e.billing(booleanValue);
                                    Object m3681throw2 = c13770e.m3681throw();
                                    if (billing2 || m3681throw2 == obj3) {
                                        m3681throw2 = booleanValue ? new C18408e(c4034e, i3) : new C18408e(c4034e, i4);
                                        c13770e.m3682throws(m3681throw2);
                                    }
                                    Function0 function0 = (Function0) m3681throw2;
                                    int i6 = booleanValue ? purchase2.ad.ad : purchase2.vip.ad;
                                    float f = 0.0f;
                                    if (booleanValue) {
                                        C9106e purchase3 = c4034e.purchase();
                                        if (purchase3 != null && (metrica2 = c4034e.metrica((c14980e2 = purchase3.ad))) != null) {
                                            int i7 = c14980e2.vip;
                                            C12476e c12476e = (C12476e) metrica2.metrica.invoke();
                                            if (c12476e != null) {
                                                f = AbstractC7255e.license(c12476e, i7);
                                            }
                                        }
                                    } else {
                                        C9106e purchase4 = c4034e.purchase();
                                        if (purchase4 != null && (metrica = c4034e.metrica((c14980e = purchase4.vip))) != null) {
                                            int i8 = c14980e.vip;
                                            C12476e c12476e2 = (C12476e) metrica.metrica.invoke();
                                            if (c12476e2 != null) {
                                                f = AbstractC7255e.license(c12476e2, i8);
                                            }
                                        }
                                    }
                                    int i9 = i5;
                                    C6497e c6497e = new C6497e(function0);
                                    boolean z2 = purchase2.metrica;
                                    boolean yandex = c13770e.yandex(interfaceC11944e);
                                    Object m3681throw3 = c13770e.m3681throw();
                                    if (yandex || m3681throw3 == obj3) {
                                        i = 0;
                                        m3681throw3 = new C0543e(interfaceC11944e, 0);
                                        c13770e.m3682throws(m3681throw3);
                                    } else {
                                        i = 0;
                                    }
                                    AbstractC9357e.vip(c6497e, booleanValue, i6, z2, 0L, f, new C8128e(interfaceC11944e, null, null, (PointerInputEventHandler) m3681throw3, 6), c13770e, 0, 16);
                                    i5 = i9 + 1;
                                    i4 = i;
                                    i3 = 1;
                                }
                                boolean z3 = i4;
                                c13770e.Signature(z3);
                                c13770e.Signature(z3);
                                z = z3;
                            }
                            c13770e.Signature(z);
                        }
                    }
                    c13770e.m3676strictfp(2013602667);
                    c13770e.Signature(false);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
        }
    }
}
