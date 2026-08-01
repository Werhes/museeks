package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌْۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13574e implements InterfaceC14080e {
    public final /* synthetic */ int metrica;

    public /* synthetic */ C13574e(int i) {
        this.metrica = i;
    }

    private final void metrica(View view, int i) {
    }

    private final void vip(View view, int i) {
    }

    @Override // defpackage.InterfaceC14080e
    public final void ad(View view, int i) {
        switch (this.metrica) {
            case 0:
                if (view instanceof TextView) {
                    AbstractC12315e.smaato((TextView) view, ColorStateList.valueOf(i));
                    return;
                }
                return;
            case 1:
                if (view instanceof ImageView) {
                    ((ImageView) view).setImageTintList(ColorStateList.valueOf(i));
                    return;
                }
                return;
            case 2:
                if (view instanceof TextView) {
                    AbstractC12315e.smaato((TextView) view, ColorStateList.valueOf(i));
                    return;
                }
                return;
            case 3:
            case 4:
                return;
            case 5:
                if (view instanceof MaterialButton) {
                    ((MaterialButton) view).setIconTint(ColorStateList.valueOf(i));
                    return;
                }
                return;
            case 6:
                if (view instanceof TextInputLayout) {
                    ((TextInputLayout) view).setHintTextColor(ColorStateList.valueOf(i));
                    return;
                }
                return;
            case 7:
                if (view != null) {
                    ColorStateList valueOf = ColorStateList.valueOf(i);
                    if (view instanceof MaterialButton) {
                        ((MaterialButton) view).setStrokeColor(valueOf);
                        return;
                    } else {
                        if (view instanceof MaterialCardView) {
                            ((MaterialCardView) view).setStrokeColor(valueOf);
                            return;
                        }
                        return;
                    }
                }
                return;
            case 8:
                if (view instanceof CardView) {
                    ((CardView) view).setCardBackgroundColor(i);
                    return;
                }
                return;
            case 9:
                if (view instanceof TabLayout) {
                    ((TabLayout) view).setSelectedTabIndicatorColor(i);
                    return;
                }
                return;
            case 10:
                if (view instanceof TextInputLayout) {
                    ((TextInputLayout) view).setBoxBackgroundColor(i);
                    return;
                }
                return;
            case 11:
                if (view instanceof MaterialButton) {
                    ((MaterialButton) view).setRippleColor(ColorStateList.valueOf(AbstractC3898e.startapp(i, 100)));
                    return;
                }
                return;
            default:
                if (view instanceof CompoundButton) {
                    ((CompoundButton) view).setButtonTintList(new ColorStateList(new int[][]{new int[]{-16842910}, new int[]{R.attr.state_enabled}}, new int[]{i, i}));
                    return;
                }
                return;
        }
    }
}
