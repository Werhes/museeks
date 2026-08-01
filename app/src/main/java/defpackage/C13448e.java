package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.car.app.navigation.model.Maneuver;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13448e {
    public int ad;
    public final ArrayList vip = new ArrayList();

    static {
        final int i = 0;
        AbstractC17056e.vip(R.attr.textColor, TextView.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i2) {
                switch (i) {
                    case 0:
                        ((TextView) view).setTextColor(i2);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i2));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i2);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i2));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i2));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i2);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i2);
                        return;
                    case 7:
                        view.setBackgroundColor(i2);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i2);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i2);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i2);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i2, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i2, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i2);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i2));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i2));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i2));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i2));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i2));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i2));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i2));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i2));
                        return;
                }
            }
        });
        final int i2 = 2;
        AbstractC17056e.vip(R.attr.textColorHint, TextView.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i2) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i3 = 5;
        AbstractC17056e.vip(R.attr.textColorLink, TextView.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i3) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i4 = 6;
        AbstractC17056e.vip(R.attr.textColorHighlight, TextView.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i4) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i5 = 7;
        AbstractC17056e.ad(R.attr.background, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i5) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i6 = 8;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.titleTextColor, Toolbar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i6) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i7 = 9;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.subtitleTextColor, Toolbar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i7) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i8 = 11;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.trackTint, SwitchCompat.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i8) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i9 = 12;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.thumbTint, SwitchCompat.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i9) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i10 = 13;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.strokeColor, MaterialCardView.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i10) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i11 = 10;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.cardBackgroundColor, CardView.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i11) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i12 = 14;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.chipBackgroundColor, Chip.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i12) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i13 = 15;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.closeIconTint, Chip.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i13) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i14 = 16;
        AbstractC17056e.ad(R.attr.backgroundTint, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i14) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i15 = 17;
        AbstractC17056e.ad(ua.itaysonlab.vkx.R.attr.backgroundTint, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i15) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i16 = 18;
        AbstractC17056e.ad(R.attr.tint, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i16) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i17 = 19;
        AbstractC17056e.vip(R.attr.indeterminateTint, ProgressBar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i17) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i18 = 20;
        AbstractC17056e.vip(R.attr.progressTint, ProgressBar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i18) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i19 = 21;
        AbstractC17056e.vip(R.attr.progressBackgroundTint, ProgressBar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i19) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i20 = 1;
        AbstractC17056e.vip(R.attr.secondaryProgressTint, ProgressBar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i20) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i21 = 3;
        AbstractC17056e.vip(ua.itaysonlab.vkx.R.attr.thumbTint, SeekBar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i22) {
                switch (i21) {
                    case 0:
                        ((TextView) view).setTextColor(i22);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i22);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i22));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i22);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i22);
                        return;
                    case 7:
                        view.setBackgroundColor(i22);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i22);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i22);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i22);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i22, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i22, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i22);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i22));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i22));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i22));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i22));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i22));
                        return;
                }
            }
        });
        final int i22 = 4;
        AbstractC17056e.vip(R.attr.thumbTint, SeekBar.class, new InterfaceC14080e() { // from class: eَۤٝ
            @Override // defpackage.InterfaceC14080e
            public final void ad(View view, int i222) {
                switch (i22) {
                    case 0:
                        ((TextView) view).setTextColor(i222);
                        return;
                    case 1:
                        ((ProgressBar) view).setSecondaryProgressTintList(ColorStateList.valueOf(i222));
                        return;
                    case 2:
                        ((TextView) view).setHintTextColor(i222);
                        return;
                    case 3:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i222));
                        return;
                    case 4:
                        ((SeekBar) view).setThumbTintList(ColorStateList.valueOf(i222));
                        return;
                    case 5:
                        ((TextView) view).setLinkTextColor(i222);
                        return;
                    case 6:
                        ((TextView) view).setHighlightColor(i222);
                        return;
                    case 7:
                        view.setBackgroundColor(i222);
                        return;
                    case 8:
                        ((Toolbar) view).setTitleTextColor(i222);
                        return;
                    case 9:
                        ((Toolbar) view).setSubtitleTextColor(i222);
                        return;
                    case 10:
                        ((CardView) view).setCardBackgroundColor(i222);
                        return;
                    case 11:
                        ((SwitchCompat) view).setTrackTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{AbstractC3898e.startapp(i222, 119), AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 119)}));
                        return;
                    case 12:
                        ((SwitchCompat) view).setThumbTintList(new ColorStateList(new int[][]{new int[]{R.attr.state_checked}, new int[]{-16842912}}, new int[]{i222, AbstractC3898e.startapp(AbstractC15933e.ad(R.attr.textColorSecondary), 255)}));
                        return;
                    case 13:
                        ((MaterialCardView) view).setStrokeColor(i222);
                        return;
                    case 14:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i222));
                        return;
                    case 15:
                        ((Chip) view).setChipBackgroundColor(ColorStateList.valueOf(i222));
                        return;
                    case 16:
                        view.setBackgroundTintList(ColorStateList.valueOf(i222));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        view.setBackgroundTintList(ColorStateList.valueOf(i222));
                        return;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        if (view instanceof ImageView) {
                            ((ImageView) view).setImageTintList(ColorStateList.valueOf(i222));
                            return;
                        }
                        return;
                    case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                        ((ProgressBar) view).setIndeterminateTintList(ColorStateList.valueOf(i222));
                        return;
                    case 20:
                        ((ProgressBar) view).setProgressTintList(ColorStateList.valueOf(i222));
                        return;
                    default:
                        ((ProgressBar) view).setProgressBackgroundTintList(ColorStateList.valueOf(i222));
                        return;
                }
            }
        });
        InterfaceC14080e.vip.put(1077215232, new Object());
    }
}
