package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17528e extends C2187e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f34366e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f34367e;

    public /* synthetic */ C17528e(int i, Object obj) {
        this.f34367e = i;
        this.f34366e = obj;
    }

    @Override // defpackage.C2187e
    public final void license(View view, C8092e c8092e) {
        int i = this.f34367e;
        Object obj = this.f34366e;
        View.AccessibilityDelegate accessibilityDelegate = this.f5558e;
        switch (i) {
            case 0:
                AccessibilityNodeInfo accessibilityNodeInfo = c8092e.ad;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo.setCheckable(checkableImageButton.f886e);
                accessibilityNodeInfo.setChecked(checkableImageButton.f887e);
                return;
            case 1:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i2 = MaterialButtonToggleGroup.f820e;
                int i3 = -1;
                if (view instanceof MaterialButton) {
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (i4 < materialButtonToggleGroup.getChildCount()) {
                            if (materialButtonToggleGroup.getChildAt(i4) == view) {
                                i3 = i5;
                            } else {
                                if ((materialButtonToggleGroup.getChildAt(i4) instanceof MaterialButton) && materialButtonToggleGroup.metrica(i4)) {
                                    i5++;
                                }
                                i4++;
                            }
                        }
                    }
                }
                c8092e.smaato(C5216e.ad(((MaterialButton) view).f812e, 0, 1, i3, 1));
                return;
            case 2:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, c8092e.ad);
                C1421e c1421e = (C1421e) obj;
                c8092e.Signature(c1421e.f4247e.getVisibility() == 0 ? c1421e.subs().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : c1421e.subs().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection));
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo2 = c8092e.ad;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCheckable(((NavigationMenuItemView) obj).f900e);
                return;
        }
    }

    @Override // defpackage.C2187e
    public void metrica(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f34367e) {
            case 0:
                super.metrica(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f34366e).f887e);
                return;
            default:
                super.metrica(view, accessibilityEvent);
                return;
        }
    }
}
