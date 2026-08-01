package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.Iterator;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؖٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3140e implements InterfaceC6034e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final C3140e f7210e = new C3140e(0);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7211e;

    public /* synthetic */ C3140e(int i) {
        this.f7211e = i;
    }

    @Override // defpackage.InterfaceC6034e
    public final Object startapp(Object obj, InterfaceC5083e interfaceC5083e) {
        Object obj2;
        Proxy.Type type;
        C4518e c4518e;
        int i;
        C15575e c15575e;
        int i2;
        switch (this.f7211e) {
            case 0:
                C13034e c13034e = (C13034e) obj;
                C15601e c15601e = AbstractC12918e.metrica;
                c15601e.license = false;
                C6571e c6571e = null;
                if (!c13034e.f25959e) {
                    c15601e.vip = null;
                    c15601e.metrica = null;
                } else if (c13034e.f25962e) {
                    c15601e.license = true;
                    c15601e.vip = null;
                    c15601e.metrica = null;
                } else {
                    Iterator it = c13034e.f25957e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (AbstractC7890e.billing(((C17196e) obj2).f33716e, c13034e.f25956e)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    C17196e c17196e = (C17196e) obj2;
                    if (c17196e != null) {
                        String str = c17196e.f33715e;
                        String str2 = c17196e.f33717e;
                        if (str.length() > 0 && str2.length() > 0) {
                            c6571e = new C6571e(str, str2);
                        }
                        c15601e.metrica = c6571e;
                        int ordinal = c17196e.f33714e.ordinal();
                        if (ordinal == 0) {
                            type = Proxy.Type.SOCKS;
                        } else {
                            if (ordinal != 1) {
                                throw new C14803e(10);
                            }
                            type = Proxy.Type.HTTP;
                        }
                        c15601e.vip = new Proxy(type, new InetSocketAddress(c17196e.f33719e, c17196e.f33718e));
                    } else {
                        c15601e.vip = null;
                        c15601e.metrica = null;
                    }
                }
                return Unit.INSTANCE;
            case 1:
                if (interfaceC5083e instanceof C4518e) {
                    c4518e = (C4518e) interfaceC5083e;
                    int i3 = c4518e.f9795e;
                    if ((i3 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c4518e.f9795e = i3 - RecyclerView.UNDEFINED_DURATION;
                        Object obj3 = c4518e.f9796e;
                        i = c4518e.f9795e;
                        if (i == 0 && i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj3);
                        return Unit.INSTANCE;
                    }
                }
                c4518e = new C4518e(this, interfaceC5083e);
                Object obj32 = c4518e.f9796e;
                i = c4518e.f9795e;
                if (i == 0) {
                }
                AbstractC2003e.purchase(obj32);
                return Unit.INSTANCE;
            case 2:
                if (interfaceC5083e instanceof C15575e) {
                    c15575e = (C15575e) interfaceC5083e;
                    int i4 = c15575e.f30744e;
                    if ((i4 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        c15575e.f30744e = i4 - RecyclerView.UNDEFINED_DURATION;
                        Object obj4 = c15575e.f30745e;
                        i2 = c15575e.f30744e;
                        if (i2 == 0 && i2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC2003e.purchase(obj4);
                        return Unit.INSTANCE;
                    }
                }
                c15575e = new C15575e(this, interfaceC5083e);
                Object obj42 = c15575e.f30745e;
                i2 = c15575e.f30744e;
                if (i2 == 0) {
                }
                AbstractC2003e.purchase(obj42);
                return Unit.INSTANCE;
            default:
                if (obj == null) {
                    throw new C14803e(10);
                }
                throw new ClassCastException();
        }
    }
}
