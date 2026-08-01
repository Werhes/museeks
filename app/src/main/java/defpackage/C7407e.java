package defpackage;

import android.content.ClipData;
import android.graphics.Point;
import android.media.metrics.LogSessionId;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import android.view.ScrollCaptureTarget;
import java.util.Arrays;
import java.util.function.Consumer;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7407e implements InterfaceC1016e, InterfaceC8856e {
    public final /* synthetic */ int ad;
    public Object vip;

    public C7407e(int i) {
        this.ad = i;
        switch (i) {
            case 3:
                this.vip = AbstractC14533e.startapp(Boolean.FALSE);
                return;
            default:
                this.vip = C15945e.metrica();
                return;
        }
    }

    public C7407e(ClipData clipData, int i) {
        this.ad = 0;
        this.vip = AbstractC14303e.license(clipData, i);
    }

    public C7407e(ContentInfo contentInfo) {
        this.ad = 1;
        contentInfo.getClass();
        this.vip = contentInfo;
    }

    @Override // defpackage.InterfaceC1016e
    public void ad(Uri uri) {
        ((ContentInfo.Builder) this.vip).setLinkUri(uri);
    }

    @Override // defpackage.InterfaceC8856e
    public int adcel() {
        return ((ContentInfo) this.vip).getSource();
    }

    @Override // defpackage.InterfaceC8856e
    public ClipData ads() {
        return ((ContentInfo) this.vip).getClip();
    }

    @Override // defpackage.InterfaceC8856e
    public ContentInfo applovin() {
        return (ContentInfo) this.vip;
    }

    @Override // defpackage.InterfaceC1016e
    public C4278e build() {
        return new C4278e(new C7407e(((ContentInfo.Builder) this.vip).build()));
    }

    @Override // defpackage.InterfaceC8856e
    public int isPro() {
        return ((ContentInfo) this.vip).getFlags();
    }

    public void license(LogSessionId logSessionId) {
        AbstractC2301e.subscription(((LogSessionId) this.vip).equals(C15945e.metrica()));
        this.vip = logSessionId;
    }

    public void metrica(ViewTreeObserverOnGlobalLayoutListenerC5014e viewTreeObserverOnGlobalLayoutListenerC5014e, C3537e c3537e, InterfaceC8850e interfaceC8850e, Consumer consumer) {
        C12431e c12431e = new C12431e(0, new C8201e[16]);
        AbstractC0890e.purchase(c3537e.ad(), 0, new C11053e(1, c12431e, C12431e.class, "add", "add(Ljava/lang/Object;)Z", 8, 2));
        Arrays.sort(c12431e.f24870e, 0, c12431e.f24868e, AbstractC0258e.ad(C8082e.f16414e, C8082e.f16419e));
        int i = c12431e.f24868e;
        C8201e c8201e = (C8201e) (i == 0 ? null : c12431e.f24870e[i - 1]);
        if (c8201e == null) {
            return;
        }
        C10163e c10163e = c8201e.metrica;
        ScrollCaptureCallbackC17336e scrollCaptureCallbackC17336e = new ScrollCaptureCallbackC17336e(c8201e.ad, c10163e, AbstractC9743e.ad(interfaceC8850e), this, viewTreeObserverOnGlobalLayoutListenerC5014e);
        AbstractC17732e abstractC17732e = c8201e.license;
        C0763e mo208goto = AbstractC0890e.metrica(abstractC17732e).mo208goto(abstractC17732e, true);
        long metrica = c10163e.metrica();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(viewTreeObserverOnGlobalLayoutListenerC5014e, AbstractC9764e.adcel(AbstractC18366e.purchase(mo208goto)), new Point((int) (metrica >> 32), (int) (metrica & 4294967295L)), scrollCaptureCallbackC17336e);
        scrollCaptureTarget.setScrollBounds(AbstractC9764e.adcel(c10163e));
        consumer.accept(scrollCaptureTarget);
    }

    @Override // defpackage.InterfaceC1016e
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.vip).setExtras(bundle);
    }

    public String toString() {
        switch (this.ad) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.vip) + "}";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC1016e
    public void vip(int i) {
        ((ContentInfo.Builder) this.vip).setFlags(i);
    }
}
