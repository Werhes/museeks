package defpackage;

import ealvatag.tag.datatype.DataTypes;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC14594e {
    public static final /* synthetic */ InterfaceC8614e[] ad = {new C13506e(AbstractC14594e.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C13506e(AbstractC14594e.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new C13506e(AbstractC14594e.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C13506e(AbstractC14594e.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C13506e(AbstractC14594e.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, DataTypes.OBJ_CONTENT_TYPE, "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new C13506e(AbstractC14594e.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new C13506e(AbstractC14594e.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new C13506e(AbstractC14594e.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new C13506e(AbstractC14594e.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new C13506e(AbstractC14594e.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new C13506e(AbstractC14594e.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C13506e(AbstractC14594e.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new C13506e(AbstractC14594e.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C13506e(AbstractC14594e.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C13506e(AbstractC14594e.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new C13506e(AbstractC14594e.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new C13506e(AbstractC14594e.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new C13506e(AbstractC14594e.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C13506e(AbstractC14594e.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new C13506e(AbstractC14594e.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new C13506e(AbstractC14594e.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new C13506e(AbstractC14594e.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new C13506e(AbstractC14594e.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new C13506e(AbstractC14594e.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new C13506e(AbstractC14594e.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new C13506e(AbstractC14594e.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC10789e.ad;
    }

    public static final void Signature(InterfaceC15671e interfaceC15671e) {
        C16591e c16591e = AbstractC9058e.amazon;
        InterfaceC8614e interfaceC8614e = ad[6];
        interfaceC15671e.appmetrica(c16591e, Boolean.TRUE);
    }

    public static final void ad(InterfaceC15671e interfaceC15671e) {
        C16591e c16591e = AbstractC9058e.ad;
        interfaceC15671e.appmetrica(AbstractC9058e.adcel, Unit.INSTANCE);
    }

    public static final void adcel(InterfaceC15671e interfaceC15671e, String str) {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC9058e.license;
        InterfaceC8614e interfaceC8614e = ad[2];
        interfaceC15671e.appmetrica(c16591e2, str);
    }

    public static final void advert(InterfaceC15671e interfaceC15671e, int i) {
        C16591e c16591e = AbstractC9058e.applovin;
        InterfaceC8614e interfaceC8614e = ad[14];
        interfaceC15671e.appmetrica(c16591e, new C11796e(i));
    }

    public static final void amazon(InterfaceC15671e interfaceC15671e, InterfaceC16154e interfaceC16154e) {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC9058e.f18138implements;
        InterfaceC8614e interfaceC8614e = ad[30];
        interfaceC15671e.appmetrica(c16591e2, interfaceC16154e);
    }

    public static void appmetrica(InterfaceC15671e interfaceC15671e, int i, Function0 function0) {
        interfaceC15671e.appmetrica(AbstractC9058e.f18140native, new C10120e(i));
        interfaceC15671e.appmetrica(AbstractC10789e.Signature, new C10591e(null, function0));
    }

    public static final void billing(InterfaceC15671e interfaceC15671e, String str) {
        C16591e c16591e = AbstractC9058e.ad;
        interfaceC15671e.appmetrica(AbstractC9058e.ad, Collections.singletonList(str));
    }

    public static void license(InterfaceC15671e interfaceC15671e, Function1 function1) {
        interfaceC15671e.appmetrica(AbstractC10789e.yandex, new C10591e(null, function1));
    }

    public static final void loadAd(InterfaceC15671e interfaceC15671e, EnumC9470e enumC9470e) {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC9058e.f18143throw;
        InterfaceC8614e interfaceC8614e = ad[26];
        interfaceC15671e.appmetrica(c16591e2, enumC9470e);
    }

    public static void metrica(InterfaceC15671e interfaceC15671e, Function0 function0) {
        interfaceC15671e.appmetrica(AbstractC10789e.vip, new C10591e(null, function0));
    }

    public static final void mopub(InterfaceC15671e interfaceC15671e, C0196e c0196e) {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC9058e.metrica;
        InterfaceC8614e interfaceC8614e = ad[1];
        interfaceC15671e.appmetrica(c16591e2, c0196e);
    }

    public static final void purchase(InterfaceC15671e interfaceC15671e, C13534e c13534e) {
        C16591e c16591e = AbstractC9058e.remoteconfig;
        InterfaceC8614e interfaceC8614e = ad[9];
        interfaceC15671e.appmetrica(c16591e, c13534e);
    }

    public static final void smaato(InterfaceC15671e interfaceC15671e, boolean z) {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC9058e.f18136extends;
        InterfaceC8614e interfaceC8614e = ad[23];
        interfaceC15671e.appmetrica(c16591e2, Boolean.valueOf(z));
    }

    public static final void startapp(InterfaceC15671e interfaceC15671e, C13333e c13333e) {
        C16591e c16591e = AbstractC9058e.pro;
        InterfaceC8614e interfaceC8614e = ad[10];
        interfaceC15671e.appmetrica(c16591e, c13333e);
    }

    public static void vip(InterfaceC15671e interfaceC15671e, Function1 function1) {
        interfaceC15671e.appmetrica(AbstractC10789e.ad, new C10591e(null, function1));
    }

    public static final void yandex(InterfaceC15671e interfaceC15671e, InterfaceC5371e interfaceC5371e) {
        C16591e c16591e = AbstractC9058e.ad;
        C16591e c16591e2 = AbstractC9058e.subscription;
        InterfaceC8614e interfaceC8614e = ad[8];
        interfaceC15671e.appmetrica(c16591e2, interfaceC5371e);
    }
}
