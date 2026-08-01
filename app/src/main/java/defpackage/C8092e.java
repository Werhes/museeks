package defpackage;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.car.app.hardware.common.CarZone;
import java.util.ArrayList;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8092e {
    public static int license;
    public final AccessibilityNodeInfo ad;
    public int vip = -1;
    public int metrica = -1;

    public C8092e(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.ad = accessibilityNodeInfo;
    }

    public static String license(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case CarZone.CAR_ZONE_COLUMN_RIGHT /* 64 */:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case PSKKeyManager.MAX_KEY_LENGTH_BYTES /* 256 */:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case 1024:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            default:
                switch (i) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.ALT:
                                        return "ACTION_DRAG_START";
                                    case R.id.CTRL:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.FUNCTION:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        switch (i) {
                                            case R.id.KEYCODE_3D_MODE:
                                                return "ACTION_SCROLL_IN_DIRECTION";
                                            case R.id.KEYCODE_4:
                                                return "ACTION_SET_EXTENDED_SELECTION";
                                            default:
                                                return "ACTION_UNKNOWN";
                                        }
                                }
                        }
                }
        }
    }

    public final void Signature(String str) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.ad;
        if (i >= 26) {
            accessibilityNodeInfo.setHintText(str);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", str);
        }
    }

    public final void ad(int i) {
        this.ad.addAction(i);
    }

    public final void adcel(int i, boolean z) {
        Bundle extras = this.ad.getExtras();
        if (extras != null) {
            int i2 = extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public final void admob(boolean z) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.ad.setImportantForAccessibility(z);
        }
    }

    public final void advert(C6594e c6594e) {
        this.ad.setCollectionInfo(c6594e == null ? null : (AccessibilityNodeInfo.CollectionInfo) c6594e.f13613e);
    }

    public final void amazon(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.ad.setDrawingOrder(i);
        }
    }

    public final boolean appmetrica(int i) {
        Bundle extras = this.ad.getExtras();
        return extras != null && (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i) == i;
    }

    public final CharSequence billing() {
        boolean isEmpty = metrica("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
        AccessibilityNodeInfo accessibilityNodeInfo = this.ad;
        if (isEmpty) {
            return accessibilityNodeInfo.getText();
        }
        ArrayList metrica = metrica("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        ArrayList metrica2 = metrica("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        ArrayList metrica3 = metrica("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        ArrayList metrica4 = metrica("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(accessibilityNodeInfo.getText(), 0, accessibilityNodeInfo.getText().length()));
        for (int i = 0; i < metrica.size(); i++) {
            spannableString.setSpan(new C14319e(((Integer) metrica4.get(i)).intValue(), this, accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) metrica.get(i)).intValue(), ((Integer) metrica2.get(i)).intValue(), ((Integer) metrica3.get(i)).intValue());
        }
        return spannableString;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8092e)) {
            return false;
        }
        C8092e c8092e = (C8092e) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = c8092e.ad;
        AccessibilityNodeInfo accessibilityNodeInfo2 = this.ad;
        if (accessibilityNodeInfo2 == null) {
            if (accessibilityNodeInfo != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo2.equals(accessibilityNodeInfo)) {
            return false;
        }
        return this.metrica == c8092e.metrica && this.vip == c8092e.vip;
    }

    public final int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.ad;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public final void isVip() {
        if (Build.VERSION.SDK_INT >= 29) {
            this.ad.setTextEntryKey(true);
        } else {
            adcel(8, true);
        }
    }

    public final void loadAd(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ad.setHeading(z);
        } else {
            adcel(2, z);
        }
    }

    public final ArrayList metrica(String str) {
        AccessibilityNodeInfo accessibilityNodeInfo = this.ad;
        ArrayList<Integer> integerArrayList = accessibilityNodeInfo.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        accessibilityNodeInfo.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public final void mopub(CharSequence charSequence) {
        this.ad.setClassName(charSequence);
    }

    public final void pro(boolean z) {
        this.ad.setScrollable(z);
    }

    public final void purchase(Rect rect) {
        this.ad.getBoundsInParent(rect);
    }

    public final void remoteconfig(boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.ad.setScreenReaderFocusable(z);
        } else {
            adcel(1, z);
        }
    }

    public final void signatures(boolean z) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.ad.setShowingHintText(z);
        } else {
            adcel(4, z);
        }
    }

    public final void smaato(C5216e c5216e) {
        this.ad.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) c5216e.ad);
    }

    public final void startapp(ArrayList arrayList) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.ad.setAvailableExtraData(arrayList);
        }
    }

    public final void subscription(CharSequence charSequence) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo accessibilityNodeInfo = this.ad;
        if (i >= 28) {
            accessibilityNodeInfo.setPaneTitle(charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public final void tapsense(CharSequence charSequence) {
        this.ad.setText(charSequence);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        purchase(rect);
        sb.append("; boundsInParent: " + rect);
        AccessibilityNodeInfo accessibilityNodeInfo = this.ad;
        accessibilityNodeInfo.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            AbstractC5666e.yandex(accessibilityNodeInfo, rect);
        } else {
            Rect rect2 = (Rect) accessibilityNodeInfo.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
            if (rect2 != null) {
                rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        }
        sb.append("; boundsInWindow: " + rect);
        sb.append("; packageName: ");
        sb.append(accessibilityNodeInfo.getPackageName());
        sb.append("; className: ");
        sb.append(accessibilityNodeInfo.getClassName());
        sb.append("; text: ");
        sb.append(billing());
        sb.append("; error: ");
        sb.append(accessibilityNodeInfo.getError());
        sb.append("; maxTextLength: ");
        sb.append(accessibilityNodeInfo.getMaxTextLength());
        sb.append("; stateDescription: ");
        sb.append(i >= 30 ? AbstractC5096e.startapp(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY"));
        sb.append("; contentDescription: ");
        sb.append(accessibilityNodeInfo.getContentDescription());
        sb.append("; supplementalDescription: ");
        sb.append(i >= 36 ? AbstractC18416e.license(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY"));
        sb.append("; tooltipText: ");
        sb.append(i >= 28 ? accessibilityNodeInfo.getTooltipText() : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY"));
        sb.append("; viewIdResName: ");
        sb.append(accessibilityNodeInfo.getViewIdResourceName());
        sb.append("; uniqueId: ");
        sb.append(i >= 33 ? AbstractC14380e.admob(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY"));
        sb.append("; checkable: ");
        sb.append(accessibilityNodeInfo.isCheckable());
        sb.append("; checked: ");
        int vip = i >= 36 ? AbstractC18416e.vip(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", accessibilityNodeInfo.isChecked() ? 1 : 0);
        String str = "PARTIAL";
        sb.append(vip == 1 ? "TRUE" : vip == 2 ? "PARTIAL" : "FALSE");
        sb.append("; fieldRequired: ");
        sb.append(i >= 36 ? AbstractC18416e.appmetrica(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
        sb.append("; focusable: ");
        sb.append(accessibilityNodeInfo.isFocusable());
        sb.append("; focused: ");
        sb.append(accessibilityNodeInfo.isFocused());
        sb.append("; selected: ");
        sb.append(accessibilityNodeInfo.isSelected());
        sb.append("; clickable: ");
        sb.append(accessibilityNodeInfo.isClickable());
        sb.append("; longClickable: ");
        sb.append(accessibilityNodeInfo.isLongClickable());
        sb.append("; contextClickable: ");
        sb.append(accessibilityNodeInfo.isContextClickable());
        sb.append("; expandedState: ");
        int metrica = i >= 36 ? AbstractC18416e.metrica(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
        if (metrica == 0) {
            str = "UNDEFINED";
        } else if (metrica == 1) {
            str = "COLLAPSED";
        } else if (metrica != 2) {
            str = metrica != 3 ? "UNKNOWN" : "FULL";
        }
        sb.append(str);
        sb.append("; enabled: ");
        sb.append(accessibilityNodeInfo.isEnabled());
        sb.append("; password: ");
        sb.append(accessibilityNodeInfo.isPassword());
        sb.append("; scrollable: " + accessibilityNodeInfo.isScrollable());
        sb.append("; containerTitle: ");
        sb.append(i >= 34 ? AbstractC5666e.startapp(accessibilityNodeInfo) : accessibilityNodeInfo.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY"));
        sb.append("; granularScrollingSupported: ");
        sb.append(appmetrica(67108864));
        sb.append("; importantForAccessibility: ");
        sb.append(i >= 24 ? accessibilityNodeInfo.isImportantForAccessibility() : true);
        sb.append("; visible: ");
        sb.append(accessibilityNodeInfo.isVisibleToUser());
        sb.append("; isTextSelectable: ");
        sb.append(i >= 33 ? AbstractC14380e.tapsense(accessibilityNodeInfo) : appmetrica(8388608));
        sb.append("; accessibilityDataSensitive: ");
        sb.append(i >= 34 ? AbstractC5666e.pro(accessibilityNodeInfo) : appmetrica(64));
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = accessibilityNodeInfo.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new C3614e(actionList.get(i2), 0, null, null, null));
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C3614e c3614e = (C3614e) arrayList.get(i3);
            int ad = c3614e.ad();
            Object obj = c3614e.ad;
            String license2 = license(ad);
            if (license2.equals("ACTION_UNKNOWN") && ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                license2 = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
            sb.append(license2);
            if (i3 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final void vip(C3614e c3614e) {
        this.ad.addAction((AccessibilityNodeInfo.AccessibilityAction) c3614e.ad);
    }

    public final boolean yandex() {
        return Build.VERSION.SDK_INT >= 26 ? this.ad.isShowingHintText() : appmetrica(4);
    }
}
