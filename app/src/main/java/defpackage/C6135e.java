package defpackage;

import android.content.ClipData;
import android.view.DragEvent;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6135e implements InterfaceC13418e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ C13031e f12894e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C13031e f12895e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C3450e f12896e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C13031e f12897e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C13031e f12898e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C13031e f12899e;

    public C6135e(C13031e c13031e, C3450e c3450e, C13031e c13031e2, C13031e c13031e3, C13031e c13031e4, C13031e c13031e5) {
        this.f12898e = c13031e;
        this.f12896e = c3450e;
        this.f12895e = c13031e2;
        this.f12897e = c13031e3;
        this.f12894e = c13031e4;
        this.f12899e = c13031e5;
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: continue, reason: not valid java name */
    public final void mo2052continue(C6057e c6057e) {
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: eؚۜؑ, reason: contains not printable characters */
    public final boolean mo2053e(C6057e c6057e) {
        String str;
        this.f12898e.invoke(c6057e);
        DragEvent dragEvent = c6057e.ad;
        ClipData clipData = dragEvent.getClipData();
        dragEvent.getClipDescription();
        C1902e c1902e = (C1902e) this.f12896e.f7707e;
        c1902e.m714e();
        c1902e.f5077e.license();
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData.getItemAt(i).getText() != null;
        }
        if (z) {
            StringBuilder sb = new StringBuilder();
            int itemCount2 = clipData.getItemCount();
            boolean z2 = false;
            for (int i2 = 0; i2 < itemCount2; i2++) {
                CharSequence text = clipData.getItemAt(i2).getText();
                if (text != null) {
                    if (z2) {
                        sb.append("\n");
                    }
                    sb.append(text);
                    z2 = true;
                }
            }
            str = sb.toString();
        } else {
            str = null;
        }
        AbstractC5679e.license(c1902e);
        if (str != null) {
            C11388e.yandex(c1902e.f5067e, str, false, 14);
        }
        return true;
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: eًًؓ, reason: contains not printable characters */
    public final void mo2054e(C6057e c6057e) {
        DragEvent dragEvent = c6057e.ad;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        long floatToRawIntBits = (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
        C1902e c1902e = this.f12897e.f25953e;
        InterfaceC0043e vip = c1902e.f5064e.vip();
        if (vip != null && vip.billing()) {
            floatToRawIntBits = vip.pro(floatToRawIntBits);
        }
        int license = c1902e.f5064e.license(floatToRawIntBits, true);
        if (license >= 0) {
            c1902e.f5067e.adcel(AbstractC9262e.metrica(license, license));
        }
        c1902e.f5077e.ads(EnumC12813e.f25633e, floatToRawIntBits);
        Unit unit = Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: goto, reason: not valid java name */
    public final void mo2055goto(C6057e c6057e) {
        this.f12899e.invoke(c6057e);
    }

    @Override // defpackage.InterfaceC13418e
    public final void inmobi(C6057e c6057e) {
        this.f12895e.invoke(c6057e);
    }

    @Override // defpackage.InterfaceC13418e
    /* renamed from: static, reason: not valid java name */
    public final void mo2056static(C6057e c6057e) {
        this.f12894e.invoke(c6057e);
    }
}
