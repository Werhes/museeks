package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.SeekBar;
import com.google.android.gms.cast.framework.media.widget.CastSeekBar;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10893e extends View.AccessibilityDelegate {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C10893e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // android.view.View.AccessibilityDelegate
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.ad) {
            case 1:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                accessibilityEvent.setClassName(SeekBar.class.getName());
                CastSeekBar castSeekBar = (CastSeekBar) this.vip;
                castSeekBar.f720e.getClass();
                accessibilityEvent.setItemCount(1);
                accessibilityEvent.setCurrentItemIndex(castSeekBar.getProgress());
                return;
            default:
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
                return;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.ad) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                EditText editText = ((C10264e) this.vip).yandex.getEditText();
                if (editText != null) {
                    accessibilityNodeInfo.setLabeledBy(editText);
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName(SeekBar.class.getName());
                if (view.isEnabled()) {
                    accessibilityNodeInfo.addAction(4096);
                    accessibilityNodeInfo.addAction(8192);
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        switch (this.ad) {
            case 1:
                if (!view.isEnabled()) {
                    return false;
                }
                if (super.performAccessibilityAction(view, i, bundle)) {
                    return true;
                }
                if (i != 4096 && i != 8192) {
                    return false;
                }
                CastSeekBar castSeekBar = (CastSeekBar) this.vip;
                castSeekBar.getClass();
                C3688e c3688e = castSeekBar.f720e;
                c3688e.getClass();
                castSeekBar.getProgress();
                c3688e.getClass();
                return false;
            default:
                return super.performAccessibilityAction(view, i, bundle);
        }
    }
}
