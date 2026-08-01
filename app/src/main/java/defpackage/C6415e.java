package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6415e implements InterfaceC0850e {
    public final InterfaceC3965e ad;
    public InterfaceC16054e metrica;
    public C16636e vip;

    public C6415e(InterfaceC3965e interfaceC3965e) {
        this.ad = interfaceC3965e;
    }

    @Override // defpackage.InterfaceC0850e
    public final void ad(int i) {
    }

    public final boolean vip(int i) {
        InterfaceC3965e interfaceC3965e;
        Function1 function1 = null;
        function1 = null;
        function1 = null;
        function1 = null;
        function1 = null;
        function1 = null;
        if (i == 7) {
            C16636e c16636e = this.vip;
            function1 = (c16636e != null ? c16636e : null).ad;
        } else if (i == 2) {
            C16636e c16636e2 = this.vip;
            if (c16636e2 == null) {
                c16636e2 = null;
            }
            c16636e2.getClass();
        } else if (i == 6) {
            C16636e c16636e3 = this.vip;
            if (c16636e3 == null) {
                c16636e3 = null;
            }
            c16636e3.getClass();
        } else if (i == 5) {
            C16636e c16636e4 = this.vip;
            if (c16636e4 == null) {
                c16636e4 = null;
            }
            c16636e4.getClass();
        } else if (i == 3) {
            C16636e c16636e5 = this.vip;
            function1 = (c16636e5 != null ? c16636e5 : null).vip;
        } else if (i == 4) {
            C16636e c16636e6 = this.vip;
            if (c16636e6 == null) {
                c16636e6 = null;
            }
            c16636e6.getClass();
        } else if (i != 1 && i != 0) {
            throw new IllegalStateException("invalid ImeAction");
        }
        if (function1 != null) {
            function1.invoke(this);
            return true;
        }
        if (i == 6) {
            InterfaceC16054e interfaceC16054e = this.metrica;
            ((C8212e) (interfaceC16054e != null ? interfaceC16054e : null)).billing(1, true);
            return true;
        }
        if (i == 5) {
            InterfaceC16054e interfaceC16054e2 = this.metrica;
            ((C8212e) (interfaceC16054e2 != null ? interfaceC16054e2 : null)).billing(2, true);
            return true;
        }
        if (i != 7 || (interfaceC3965e = this.ad) == null) {
            return false;
        }
        ((C3112e) interfaceC3965e).ad();
        return true;
    }
}
