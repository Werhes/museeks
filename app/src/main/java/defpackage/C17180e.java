package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17180e extends AbstractC16997e {

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public final int f33677e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final int f33678e;

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public boolean f33679e;

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public final Function0 f33680e;

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public final Function2 f33681e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final int f33682e;

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public final Function0 f33683e;

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public final Function0 f33684e;

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public final int f33685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17180e(int i, int i2, int i3, C2892e c2892e, C5938e c5938e, Function0 function0, C5938e c5938e2, int i4) {
        super(false, 3);
        int i5 = (i4 & 8) != 0 ? R.string.cancel : R.string.libvkx_enable_warn_action;
        c2892e = (i4 & 32) != 0 ? AbstractC0326e.ad : c2892e;
        Function0 c13630e = (i4 & 64) != 0 ? new C13630e(25) : c5938e;
        Function0 c13630e2 = (i4 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? new C13630e(26) : c5938e2;
        this.f33678e = i;
        this.f33682e = i2;
        this.f33685e = i5;
        this.f33677e = i3;
        this.f33681e = c2892e;
        this.f33683e = c13630e;
        this.f33684e = function0;
        this.f33680e = c13630e2;
    }

    @Override // defpackage.AbstractC5004e
    public final void amazon() {
        super.amazon();
        if (this.f33679e) {
            return;
        }
        this.f33680e.invoke();
    }

    @Override // defpackage.AbstractC16997e
    public final void tapsense(C13770e c13770e, int i) {
        c13770e.m3671package(-214283322);
        int i2 = (c13770e.yandex(this) ? 4 : 2) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            AbstractC12121e.ad(null, null, 0L, 0L, 0.0f, 0.0f, null, AbstractC16653e.license(500181707, new C6897e(this), c13770e), c13770e, 12582912, 127);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6897e(this, i);
        }
    }
}
