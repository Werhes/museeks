package defpackage;

import android.util.Rational;
import android.util.Size;
import j$.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3186e implements InterfaceC16100e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C4069e f7297e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7298e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3186e(int i) {
        this(C4069e.license(), 0);
        this.f7298e = i;
        switch (i) {
            case 1:
                this(C4069e.license(), 1);
                return;
            case 2:
                this(C4069e.license(), 2);
                return;
            default:
                return;
        }
    }

    public C3186e(C4069e c4069e, int i) {
        this.f7298e = i;
        switch (i) {
            case 1:
                this.f7297e = c4069e;
                C14326e c14326e = InterfaceC7775e.f15760e;
                Class cls = (Class) c4069e.smaato(c14326e, null);
                if (cls != null && !cls.equals(C3373e.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
                }
                c4069e.yandex(InterfaceC12438e.f24886e, EnumC12633e.f25351e);
                c4069e.yandex(c14326e, C3373e.class);
                C14326e c14326e2 = InterfaceC7775e.f15761e;
                if (c4069e.smaato(c14326e2, null) == null) {
                    c4069e.yandex(c14326e2, C3373e.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            case 2:
                this.f7297e = c4069e;
                C14326e c14326e3 = InterfaceC7775e.f15760e;
                Class cls2 = (Class) c4069e.smaato(c14326e3, null);
                if (cls2 != null && !cls2.equals(C9301e.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls2);
                }
                c4069e.yandex(InterfaceC12438e.f24886e, EnumC12633e.f25349e);
                c4069e.yandex(c14326e3, C9301e.class);
                C14326e c14326e4 = InterfaceC7775e.f15761e;
                if (c4069e.smaato(c14326e4, null) == null) {
                    c4069e.yandex(c14326e4, C9301e.class.getCanonicalName() + "-" + UUID.randomUUID());
                }
                C14326e c14326e5 = InterfaceC13842e.firebase;
                if (((Integer) c4069e.smaato(c14326e5, -1)).intValue() == -1) {
                    c4069e.yandex(c14326e5, 2);
                    return;
                }
                return;
            case 3:
                this.f7297e = c4069e;
                if (!c4069e.f33330e.containsKey(C5186e.f11091e)) {
                    throw new IllegalArgumentException("VideoOutput is required");
                }
                C14326e c14326e6 = InterfaceC7775e.f15760e;
                Class cls3 = (Class) c4069e.smaato(c14326e6, null);
                if (cls3 != null && !cls3.equals(C16864e.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls3);
                }
                c4069e.yandex(InterfaceC12438e.f24886e, EnumC12633e.f25350e);
                c4069e.yandex(c14326e6, C16864e.class);
                C14326e c14326e7 = InterfaceC7775e.f15761e;
                if (c4069e.smaato(c14326e7, null) == null) {
                    c4069e.yandex(c14326e7, C16864e.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
            default:
                this.f7297e = c4069e;
                C14326e c14326e8 = InterfaceC7775e.f15760e;
                Class cls4 = (Class) c4069e.smaato(c14326e8, null);
                if (cls4 != null && !cls4.equals(C12477e.class)) {
                    throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls4);
                }
                c4069e.yandex(InterfaceC12438e.f24886e, EnumC12633e.f25348e);
                c4069e.yandex(c14326e8, C12477e.class);
                C14326e c14326e9 = InterfaceC7775e.f15761e;
                if (c4069e.smaato(c14326e9, null) == null) {
                    c4069e.yandex(c14326e9, C12477e.class.getCanonicalName() + "-" + UUID.randomUUID());
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3186e(defpackage.InterfaceC16798e r3) {
        /*
            r2 = this;
            r0 = 3
            r2.f7298e = r0
            eّؖۛ r0 = defpackage.C4069e.license()
            eٓۢۜ r1 = defpackage.C5186e.f11091e
            r0.yandex(r1, r3)
            eٓۢۜ r1 = defpackage.InterfaceC12438e.f24887e
            boolean r3 = r3.billing()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            r0.yandex(r1, r3)
            r3 = 3
            r2.<init>(r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3186e.<init>(eٗؗؖ):void");
    }

    public C3373e ad() {
        Integer valueOf = Integer.valueOf(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
        C14326e c14326e = C5753e.f12175e;
        C4069e c4069e = this.f7297e;
        Integer num = (Integer) c4069e.smaato(c14326e, null);
        if (num != null) {
            c4069e.yandex(InterfaceC14405e.isPro, num);
        } else {
            C11460e c11460e = C3373e.subs;
            C14326e c14326e2 = C5753e.f12170e;
            if (Objects.equals(c4069e.smaato(c14326e2, null), 2)) {
                c4069e.yandex(InterfaceC14405e.isPro, 32);
            } else if (Objects.equals(c4069e.smaato(c14326e2, null), 3)) {
                c4069e.yandex(InterfaceC14405e.isPro, 32);
                c4069e.yandex(InterfaceC14405e.applovin, valueOf);
            } else if (Objects.equals(c4069e.smaato(c14326e2, null), 1)) {
                c4069e.yandex(InterfaceC14405e.isPro, 4101);
                c4069e.yandex(InterfaceC14405e.ads, C14677e.metrica);
            } else {
                c4069e.yandex(InterfaceC14405e.isPro, valueOf);
            }
        }
        C5753e c5753e = new C5753e(C17015e.vip(c4069e));
        AbstractC14100e.purchase(c5753e);
        C3373e c3373e = new C3373e(c5753e);
        Size size = (Size) c4069e.smaato(InterfaceC13842e.f27419class, null);
        if (size != null) {
            c3373e.tapsense = new Rational(size.getWidth(), size.getHeight());
        }
        AbstractC4265e.billing((Executor) c4069e.smaato(InterfaceC15153e.f29990throw, AbstractC3062e.smaato()), "The IO executor can't be null");
        C14326e c14326e3 = C5753e.f12171e;
        if (c4069e.f33330e.containsKey(c14326e3)) {
            Integer num2 = (Integer) c4069e.subscription(c14326e3);
            if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
            }
            if (num2.intValue() == 3 && c4069e.smaato(C5753e.f12176e, null) == null) {
                throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
            }
        }
        return c3373e;
    }

    @Override // defpackage.InterfaceC16100e
    /* renamed from: interface */
    public final InterfaceC12438e mo819interface() {
        switch (this.f7298e) {
            case 0:
                return new C9654e(C17015e.vip(this.f7297e));
            case 1:
                return new C5753e(C17015e.vip(this.f7297e));
            case 2:
                return new C5450e(C17015e.vip(this.f7297e));
            default:
                return new C5186e(C17015e.vip(this.f7297e));
        }
    }

    @Override // defpackage.InterfaceC18242e
    public final InterfaceC13659e isVip() {
        switch (this.f7298e) {
            case 0:
                return this.f7297e;
            case 1:
                return this.f7297e;
            case 2:
                return this.f7297e;
            default:
                return this.f7297e;
        }
    }
}
